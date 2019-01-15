package com.chenhl.jdk8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest14 {

    public static void main(String[] args) {
//        Student student = new Student("", 20, 10);
//        Student student2 = new Student("", 10, 30);
//        List<Student> students = Arrays.asList(student, student2);
//
//
//        List<String> list = students.stream().map(Student::getName).filter(s -> !s.isEmpty()).collect(Collectors.toList());
//
//        System.out.println(list==null);
//        System.out.println(list);


//        List<Long> ids = Arrays.asList(100L, 200L, 300L, 100l, 200l, 300l, 400l);
//        String collect = ids.stream().distinct().map(String::valueOf).collect(Collectors.joining(","));
//        System.out.println(collect);


        List<String> strings = Stream.of("C", "A", "B")

                .sorted()

                .collect(Collectors.toList());

        System.out.println(strings);

    }
}
