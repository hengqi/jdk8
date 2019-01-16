package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

//        传统⽅方式对字符串串集合排序：
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

//        Lambda方式
        // expression
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
        // statement
        Collections.sort(names, (String o1, String o2) -> {
            return o2.compareTo(o1);
        });

    }
}
