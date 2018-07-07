package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    flatmap distinct的应用实例
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "hello welcome", " world welcome", "hello world welcome");

        List<String> collect = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
