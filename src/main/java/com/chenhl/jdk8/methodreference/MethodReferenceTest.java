package com.chenhl.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        //1. 类名::静态方法名
//        students.sort((stu1, stu2) -> Student.compareStudentByScore(stu1, stu2));
//        students.forEach(student -> System.out.println(student));

//        students.sort(Student::compareStudentByScore);
//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student));


        //2. 引用名::实例方法名
//        StudentComparator studentComparator = new StudentComparator();
//        students.sort((s1, s2) -> studentComparator.compareStudentByScore(s1, s2));
//        students.sort(studentComparator::compareStudentByScore);
//        students.sort(studentComparator::compareStudentByName);
//        students.forEach(student -> System.out.println(student));

        //3. 类名::实例方法名
//        students.sort(Student::compareStudentByName2);
//        students.sort(Student::compareStudentByScore2);
//        students.forEach(student -> System.out.println(student));

//        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");
//        Collections.sort(cities, (c1, c2) -> c1.compareToIgnoreCase(c2));
//        cities.sort(String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        //4. 构造方法引用 类名::new
        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));

        System.out.println(test.getString2("hello", String::new));
    }
}
