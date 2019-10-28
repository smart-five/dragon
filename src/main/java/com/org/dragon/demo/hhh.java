package com.org.dragon.demo;

import org.joda.time.DateTime;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/09/19 15:19 <br>
 * @see com.org.dragon.demo <br>
 */
public class hhh {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
        System.out.println("当前时间:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:sss"));

        scheduledExecutorService.schedule(()->{
            System.out.println("当前时间:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:sss"));
        },1, TimeUnit.MINUTES);

        System.out.println("哈哈哈哈哈");

    }
}
