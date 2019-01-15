package com.chenhl.jdk8.stream2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: chenhonglei
 * @Date: 2018/10/19 13:26
 * @Description:
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("a")) {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}


