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
 * @date 2020/10/28 22:20
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {

    /***
     * @Author Jiang
     * @Description 当通道就绪，触发此方法
     * @Date 22:23 2020/10/28
     * @Param [ctx]
     * @return void
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("剑道万古", CharsetUtil.UTF_8));
    }

    /***
     * @Author Jiang
     * @Description 通道有读取事件时触发
     * @Date 22:25 2020/10/28
     * @Param [ctx, msg]
     * @return void
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf byteBuf = (ByteBuf) msg;

        System.out.println("服务器返回的数据:" + byteBuf.toString(CharsetUtil.UTF_8));
        System.out.println("服务器地址：" + ctx.channel().remoteAddress());
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
        cause.printStackTrace();
        //发生异常关闭通道
        ctx.close();
    }

}
