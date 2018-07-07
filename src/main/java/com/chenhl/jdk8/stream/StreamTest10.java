package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "welcome");

        // 流的底层的执行逻辑，并不是多次循环，而是将所有的操作应用到每个元素上
        list.stream().mapToInt(item -> {
            int len = item.length();
            System.out.println(item);
            return len;
        }).filter(len -> len == 5).findFirst().ifPresent(System.out::println);
    }
}
