package com.org.dragon.core.demo.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import org.joda.time.DateTime;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/08/09 16:38 <br>
 * @see com.org.dragon.core.demo.netty <br>
 */
public class NettyClient {

    public static void main(String[] args) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();

        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel ch) {
                        ch.pipeline().addLast(new StringEncoder());
                    }
                });

        Channel channel = bootstrap.connect("127.0.0.1", 8000).channel();

        while (true) {
            channel.writeAndFlush(DateTime.now().toString("yyyy-MM-dd HH:mm:ss") + " : hello world!");
            Thread.sleep(2000);
        }
    }
}
