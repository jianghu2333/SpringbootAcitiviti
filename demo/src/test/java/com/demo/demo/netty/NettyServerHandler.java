package com.demo.demo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.netty
 * @date 2020/10/28 21:30
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    /***
     * @Author Jiang
     * @Description 读取客户端发送的数据
     * @Date 21:32 2020/10/28
     * @Param [ctx, msg]
     * @return void
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf byteBuf = (ByteBuf) msg;

        System.out.println("客户端发送数据:" + byteBuf.toString(CharsetUtil.UTF_8));
        System.out.println("客户端地址：" + ctx.channel().remoteAddress());
    }

    /***
     * @Author Jiang
     * @Description 数据读取完毕  返回消息
     * @Date 21:49 2020/10/28
     * @Param [ctx]
     * @return void
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        //将数据写入缓存并刷新
        ctx.writeAndFlush(Unpooled.copiedBuffer("返回的数据", CharsetUtil.UTF_8));
    }

    /***
     * @Author Jiang
     * @Description 异常处理
     * @Date 22:03 2020/10/28
     * @Param [ctx, cause]
     * @return void
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //发生异常关闭通道
        ctx.close();
    }
}
