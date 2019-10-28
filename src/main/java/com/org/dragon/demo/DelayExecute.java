package com.org.dragon.demo;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019/08/06 10:17 <br>
 * @see com.org.dragon.demo <br>
 */
public class DelayExecute {

    static DelayQueue<DelayedHandler> delayQueue = new DelayQueue<>();

    public static void main(String[] args) throws InterruptedException {

        Date cancelTime = DateTime.now().plusMinutes(3).toDate();

        DelayedHandler handler = new DelayedHandler(new Date(), cancelTime);

        System.out.println("当前时间:"+DateTime.now().toString("yyyy-MM-dd HH:mm:sss"));
        delayQueue.add(handler);


        DelayedHandler take = delayQueue.take();

        System.out.println(take);
        System.out.println("当前时间:"+DateTime.now().toString("yyyy-MM-dd HH:mm:sss"));

    }
}
