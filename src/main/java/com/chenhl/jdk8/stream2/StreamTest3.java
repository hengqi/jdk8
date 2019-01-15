package com.chenhl.jdk8.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: chenhonglei
 * @Description:
 */
public class StreamTest3 {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello", "world", "welcome", "hello world", "person", "student");
//        List<String> list = Arrays.asList("hello", "world", "welcome");
//        System.out.println(list.getClass());
        // 当一个流没有中间操作时，会调用到ReferencePipeline.Head里的一个实现里
//        list.stream().forEach(System.out::println);


        // 反之会调用到ReferencePipeline的实现里
//        list.stream().map(item -> item).filter(item -> true).forEach(System.out::println);
//        list.stream().map(item -> item+"abc").forEach(System.out::println);

//        list.stream().parallel().forEach(System.out::println);


        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("welcome");


        Stream<String> stream = list.stream();

        System.out.println("11111111111111111111111");

        Stream<String> stream1 = stream.map(item -> item + "_abc");

        System.out.println("222222222222222222222222");

        Stream<String> stream2 = stream1.filter(item -> item.endsWith("_abc"));

        System.out.println("333333333333333333333333");

        stream2.forEach(System.out::println);

        System.out.println("444444444444444444444444");
    }

}
