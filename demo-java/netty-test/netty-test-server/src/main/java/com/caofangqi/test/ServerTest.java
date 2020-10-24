package com.caofangqi.test;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author FangQi Cao
 */
public class ServerTest {

    private final int port;

    public ServerTest(int port){
        this.port = port;
    }

    public static void main(String[] args) throws Exception{
        new ServerTest(1314).start();
    }

    public void start()throws Exception{
        final ServerTestHandler test = new ServerTestHandler();
        EventLoopGroup group  = new NioEventLoopGroup();
        ServerBootstrap b = new ServerBootstrap();
        b.group(group)
                .channel(NioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(test);
                    }
                });

        ChannelFuture f = b.bind().sync();
        f.channel().closeFuture().sync();
        group.shutdownGracefully().sync();

    }



}
