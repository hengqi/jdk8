package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    分组 groupingBy
    分区 partionBy
 */
public class StreamTest13 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        // 根据名字进行分组
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);

        // 根据分数进行分组
        Map<Integer, List<Student>> map1 = students.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map1);

        // 根据名字进行分组，然后求出每个分组的个数
        Map<String, Long> map2 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(map2);

        // 根据名字进行分组，然后求出每个分组中学生分数的平均值
        Map<String, Double> map3 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(map3);

        // 分区 只会分成两个区，false区和true区
        // 以90分来分区
        Map<Boolean, List<Student>> map4 = students.stream().collect(Collectors.partitioningBy(s -> s.getScore() >= 90));
        System.out.println(map4);

    }
}
