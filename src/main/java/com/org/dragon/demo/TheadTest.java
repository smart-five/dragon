package com.org.dragon.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/09/27 17:39 <br>
 * @see com.org.dragon.demo <br>
 */
public class TheadTest {


        private static final ExecutorService executor = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });


        static class Test01 implements Runnable{
            private int i = 2;
            @Override
            public void run() {
//                executor.submit(new Test02());
                try {
                    getTest02();
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                System.out.println(Thread.currentThread().getName()+"执行"+i);
            }
        }

        static class Test02 implements Callable {
            private int i = 1;

            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName()+"执行"+i);
                return null;
            }
        }

        private static void getTest02(){
            for (int i = 0; i < 20; i++) {
                Test02 t = new Test02();
                executor.submit(t);
            }
        }



        public static void main(String[] args) {
            TheadTest.Test01 t01 = new Test01();
            executor.submit(t01);
        }


}
