package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        // 构建流的第一种方式
        Stream<String> stream1 = Stream.of("hello", "world", "welcome");
        
        // 构建流的第二种方式使用数组
        String[] myArray = new String[] {"hello", "world", "welcome"};
        Stream<String> stream2 = Stream.of(myArray);
        
        Stream<String> stream3 = Arrays.stream(myArray);
        
        // 由集合来创建一个流
        List<String> list = Arrays.asList(myArray);
        list.stream();

    }
}


/*
    1.流不存储值，通过管道的方式获取值
    2.本质是函数式的，对流的操作会生成一个结果，不过并不会修改底层的数据源，集合可以作为流的底层数据源
    3.延迟查找，很多流操作（过滤，映射，排序等）都可以延迟实现

 */