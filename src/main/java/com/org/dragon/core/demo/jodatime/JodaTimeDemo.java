package com.org.dragon.core.demo.jodatime;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/08/25 17:06 <br>
 * @see com.org.dragon.core.demo <br>
 */
public class JodaTimeDemo {

    public static void main(String[] args) {
        DateTime submitDate = DateTime.now().plusDays(30);
        int days = Days.daysBetween(DateTime.now(), submitDate).getDays();
        if (days <= 30) {
            System.out.println(days);
        }
//        System.out.println(days);
    }
}
