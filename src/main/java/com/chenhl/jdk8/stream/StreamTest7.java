package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 中间操作和终止操作的本质区别：
 * 所有的中间操作都是惰性的，延迟的，也就是说只有遇到了终止操作的时候，这若干个中间操作才会一并的执行
 */
public class StreamTest7 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);

        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        })
        // 没有这个代码，上面的终止操作是不会被执行的。
        .forEach(System.out::println);
    }
}
