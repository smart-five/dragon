package com.org.dragon.core.demo;

import org.joda.time.DateTime;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <Description> <br>
 * 调度任务测试
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/09/19 15:19 <br>
 * @see com.org.dragon.core.demo <br>
 */
public class ScheduledExecutorServiceTest {

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
