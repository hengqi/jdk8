package com.chenhl.base;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("java", "java");
        linkedHashMap.put("golang", "golang");
        linkedHashMap.put("python", "python");
        linkedHashMap.put("ruby", "ruby");
        linkedHashMap.put("scala", "scala");
        linkedHashMap.put("c", "c");

        System.out.println(linkedHashMap);
    }
}
