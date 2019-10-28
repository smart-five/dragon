package com.org.dragon.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019 /08/06 10:16 <br>
 * @see com.org.dragon.demo<br>
 */
@Data
@AllArgsConstructor
public class DelayedHandler implements Delayed {

    private Date createTime;
    private Date cancelTime;
    /**
     * Gets delay.
     *
     * @param unit the unit
     * @return the delay
     */
    @Override
    public long getDelay(TimeUnit unit) {
        System.out.println("=========Delayed=========");
        return unit.convert(cancelTime.getTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /**
     * Compare to int.
     *
     * @param o the o
     * @return the int
     */
    @Override
    public int compareTo(Delayed o) {
        return this.getCancelTime().compareTo(((DelayedHandler) o).getCancelTime());
    }
}
