package com.chenhl.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/*
    关于串行流与并行流
 */
public class StreamTest9 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");

        long startTime = System.nanoTime();

//        list.stream().sorted().count();//串行排序
        list.parallelStream().sorted().count();//并行排序

        long endTime = System.nanoTime();

        long mills = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时: " + mills);
    }
}

