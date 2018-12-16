package com.chenhl.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

        // 升序排序
//        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
//        Collections.sort(list, Comparator.naturalOrder());

//        Collections.sort(list, ((o1, o2) -> o1.length() - o2.length()));
//        Collections.sort(list, Comparator.comparingInt(String::length));
//         降序
//        Collections.sort(list, ((o1, o2) -> o2.length() - o2.length()));
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        // 此处需要显示指定str的类型
//        Collections.sort(list, Comparator.comparingInt(str -> str.length()).reversed());
//        Collections.sort(list, Comparator.comparingInt((String str) -> str.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length).reversed());


        // 两级排序
        // 先根据长度排序，然后根据首字母ASCII排序
        // thenComparing起作用的情况是，前面的比较器比较的结果为0才会调用thenComparaing
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

//        list.sort(Comparator.comparingInt(String::length)
//                .thenComparing(String::toLowerCase, Comparator.reverseOrder()));

//        list.sort(Comparator.comparingInt(String::length).reversed()
//                .thenComparing(String::toLowerCase, Comparator.reverseOrder()));

        list.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(String::toLowerCase, Comparator.reverseOrder())
                .thenComparing(Comparator.reverseOrder()));//此处的thenComparing不起作用，因为已经排出来了

        System.out.println(list);
    }
}
