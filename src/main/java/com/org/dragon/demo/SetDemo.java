package com.org.dragon.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019/08/05 15:08 <br>
 * @see com.org.dragon.controller <br>
 */
public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(i);
            set.remove(i - 1);
        }

        System.out.println(set.size());


        Set<Short> set1 = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            set1.add(i);
            set1.remove(i - 1);
        }

        System.out.println(set1.size());

        Object i = 1 == 1 ? new Integer(3) : new Float(1);

        System.out.println(i);
    }
}
