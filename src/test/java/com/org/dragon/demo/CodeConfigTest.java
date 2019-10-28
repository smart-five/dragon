package com.org.dragon.demo;

import com.google.common.collect.Sets;
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
 * @date 2019/08/19 10:41 <br>
 * @see com.org.dragon.demo <br>
 */
public class CodeConfigTest extends TestCase {

    public void testLength() throws InterruptedException {

        CodeConfig config = CodeConfig.length(8);


        ExecutorService executor = Executors.newFixedThreadPool(10);

        CountDownLatch count = new CountDownLatch(3);

        long begin = System.currentTimeMillis();

        Set<String> set = Sets.newConcurrentHashSet();
        executor.submit(() -> {
            try {
                for (int i = 0; i < 4000000; i++) {
                    set.add(VoucherCodes.generate(config));
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
                    set.add(VoucherCodes.generate(config));
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
                    set.add(VoucherCodes.generate(config));
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