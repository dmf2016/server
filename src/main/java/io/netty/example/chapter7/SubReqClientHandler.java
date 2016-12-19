package io.netty.example.chapter7;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.example.chapter7.bean.SubscribeReq;

public class SubReqClientHandler extends ChannelHandlerAdapter {

    public SubReqClientHandler() {
    }

    public void channelActive(ChannelHandlerContext ctx) {
        for (int i = 0; i < 10; i++) {
            ctx.write(subReq(i));
        }
        ctx.flush();
    }

    private SubscribeReq subReq(int i) {
        SubscribeReq req = new SubscribeReq();
        req.setAddress("南京市雨花台区软件大道101号华为基地");
        req.setPhoneNumber("138xxxxxxxxx");
        req.setProductName("Netty 最佳实践和原理分析");
        req.setSubReqID(i);
        req.setUserName("Lilinfeng");
        return req;
    }

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("Receive server response : [" + msg + "]");
    }

    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
