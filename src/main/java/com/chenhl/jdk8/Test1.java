package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 外部迭代
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----");

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("-----");

        // 内部迭代
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("-----");

        // 使用Lambda表达式
        list.forEach(integer -> System.out.println(integer));

        System.out.println("-----");

        // 使用方法引用
        list.forEach(System.out::println);
    }
}
