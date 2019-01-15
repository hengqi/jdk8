package com.chenhl.base;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1"); a.add("2"); a.add("3");
//        a.clear();
        List<String> b = new ArrayList<>();
//        b.add("2");b.add("3");
        b.add("5");
        b.removeAll(a);
        System.out.println(b);
    }
}
