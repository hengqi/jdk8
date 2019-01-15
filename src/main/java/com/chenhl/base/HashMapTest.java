package com.chenhl.base;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("java", "java");
        map.put("golang", "golang");
        map.put("python", "python");
        map.put("ruby", "ruby");
        map.put("scala", "scala");
        map.put("c", "c");

        System.out.println(map);
    }
}
