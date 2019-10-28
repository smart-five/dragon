package com.org.dragon.core.demo;

import com.google.common.collect.Sets;
import com.org.dragon.core.utils.VerifiableSerial;
import junit.framework.TestCase;

import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/08/19 10:25 <br>
 * @see com.org.dragon.core.demo <br>
 */
public class VerifiableSerialTest extends TestCase {

    public void testCreate() throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        CountDownLatch count = new CountDownLatch(3);

        long begin = System.currentTimeMillis();

        Set<String> set = Sets.newConcurrentHashSet();
        executor.submit(() -> {
            try {
                for (int i = 0; i < 4000000; i++) {
                    set.add(VerifiableSerial.create(3, 8));
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                count.countDown();
            }

        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < 4000000; i++) {
                    set.add(VerifiableSerial.create(3, 8));
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                count.countDown();
            }

        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < 4000000; i++) {
                    set.add(VerifiableSerial.create(3, 8));
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                count.countDown();
            }

        });

        count.await();

        System.out.println(System.currentTimeMillis() - begin);

        System.out.println(set.size());

        executor.shutdown();

    }
}