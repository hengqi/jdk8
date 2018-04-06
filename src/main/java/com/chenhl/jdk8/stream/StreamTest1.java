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
