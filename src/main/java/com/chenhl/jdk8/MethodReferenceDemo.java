package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;

/*
方法引用：实际上是Lambda表达式的一种语法糖

我们可以将方法引用看作是一个“函数指针”

方法引用共分为4类：
1. 类名::静态方法名
2. 对象::实例方法名
3. 类名::实例方法名
4. 类名::new
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.forEach(item -> System.out.println(item));

        System.out.println("--------");

        list.forEach(System.out::println);
    }
}
