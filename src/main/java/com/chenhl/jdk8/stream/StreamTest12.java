package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("张三", "lisi", "wangwu", "zhaoliu");

        List<String> collect = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
                .collect(Collectors.toList());

        collect.forEach(s -> System.out.println(s));


    }
}
