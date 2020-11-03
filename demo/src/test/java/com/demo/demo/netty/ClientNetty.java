package com.demo.demo.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.netty
 * @date 2020/10/28 22:14
 */
public class ClientNetty {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup loopGroup = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(loopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new NettyClientHandler());
                        }
                    });
            System.out.println("客户端ok");
            //启动客户端连接服务器
            ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 8888).sync();
            //监听关闭通道
            channelFuture.channel().closeFuture().sync();
        } finally {
                loopGroup.shutdownGracefully();
        }


    }
}
