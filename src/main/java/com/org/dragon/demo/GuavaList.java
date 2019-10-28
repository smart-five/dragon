package com.org.dragon.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/10/25 下午4:04 <br>
 * @see com.org.dragon.demo <br>
 */
public class GuavaList {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        List<List<Integer>> sublist = Lists.partition(list, 10);

        for (List<Integer> integers : sublist) {
            System.out.println(integers);
        }
    }
}
