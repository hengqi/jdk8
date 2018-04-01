package com.chenhl.jdk8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.empty();

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        // 推荐的optional使用方式
        optional.ifPresent(System.out::println);

        System.out.println("---------");
        System.out.println(optional.orElse("world"));

        System.out.println("---------");
        System.out.println(optional.orElseGet(() -> "你好"));
    }
}
