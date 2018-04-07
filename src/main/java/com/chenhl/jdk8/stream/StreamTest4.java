package com.chenhl.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {

//        Stream<String> stream = Stream.of("hello", "world", "hello world");

//        String[] strings = stream.toArray(length -> new String[length]);

//        String[] strings = stream.toArray(String[]::new);
//        Arrays.asList(strings).forEach(s -> System.out.println(s));


        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        List<String> collect = stream.collect(Collectors.toList());
//        collect.forEach(s -> System.out.println(s));

//        List<String> list = stream.collect(() -> new ArrayList<>(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
//        list.forEach(s -> System.out.println(s));

//        LinkedList<Object> linkedList = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        linkedList.forEach(System.out::println);

//        ArrayList<String> collect = stream.collect(Collectors.toCollection(ArrayList::new));
//        collect.forEach(System.out::println);

//        TreeSet<String> collect = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect.getClass());
//        collect.forEach(System.out::println);

        String s = stream.collect(Collectors.joining("|")).toString();
        System.out.println(s);
    }
}
