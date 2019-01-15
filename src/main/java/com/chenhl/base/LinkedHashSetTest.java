package com.chenhl.base;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("java");
        linkedHashSet.add("golang");
        linkedHashSet.add("python");
        linkedHashSet.add("ruby");
        linkedHashSet.add("scala");
        linkedHashSet.add("c");
        linkedHashSet.add("ruby");

        System.out.println(linkedHashSet);
    }
}
