import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author FangQi Cao
 */
public class ClientTest {
    private final  String host;
    private final int port;

    public ClientTest(String host,int port){
        this.host = host;
        this.port = port;
    }

    public static void main(String[] args) throws InterruptedException {
        new ClientTest("127.0.0.1",1314).start();
    }

    public  void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap b = new Bootstrap();
        b.group(group)
                .channel(NioSocketChannel.class)
                .remoteAddress(new InetSocketAddress(host,port))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ClientTestHandler());
                    }
                });
        b.connect().sync().channel().closeFuture().sync();
        group.shutdownGracefully().sync();
    }
}
