package com.org.dragon.demo;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/08/15 10:32 <br>
 * @see com.org.dragon.demo <br>
 */
public class RandomID {

    private static ThreadLocalRandom current = ThreadLocalRandom.current();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        CountDownLatch count = new CountDownLatch(1);

        Set<String> set = Sets.newConcurrentHashSet();
//        Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap(20000000));

        long begin = System.currentTimeMillis();
//        System.out.println(begin);
        executor.submit(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    long time = System.nanoTime();
                    System.out.println(time);
//                    set.add(randomID());
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                count.countDown();
            }
        });

//        executor.submit(() -> {
//            try {
//                for (int i = 0; i < 5000000; i++) {
//                    set.add(randomID());
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                count.countDown();
//            }
//        });


        count.await();

        System.out.println(System.currentTimeMillis()-begin);

//        System.out.println(set.size());

//        System.out.println(JSON.toJSONString(set));

        executor.shutdown();


        List<String> collect = set.stream()
                .filter(x-> StringUtils.isNotBlank(x))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    private static String randomID() {
        StringBuilder sb = new StringBuilder(20);
//

//        String id = String.valueOf();
        long time = System.nanoTime();
        System.out.println(time);

        return sb.append(time).substring(2,12);

    }
}
