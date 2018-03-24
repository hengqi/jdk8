package com.chenhl.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {

    public static void main(String[] args) {
//        TheInterface theInterface = () -> {
//        };
//
//        System.out.println(theInterface.getClass().getInterfaces()[0]);
//
//        TheInterface2 theInterface2 = () -> {
//        };
//
//        System.out.println(theInterface2.getClass().getInterfaces()[0]);
//
//
//        new Thread(() -> {
//            System.out.println("hello world");
//        }).start();


        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.forEach(str -> {
//            System.out.println(str.toUpperCase());
//        });

//        List<String> list1 = new ArrayList<>();
//        list.forEach(item -> list1.add(item.toUpperCase()));
//        System.out.println(list1);

//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        // 使用方法引用的方式
//        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

    }
}

interface TheInterface {

    void myMethod();
}

interface TheInterface2 {

    void myMethod2();
}
