package com.chenhl.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        Stream<String> stream = Stream.empty();
//        System.out.println(stream.findFirst().get());
        stream.findFirst().ifPresent(System.out::println);


        System.out.println("----------");

        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);

        System.out.println("----------");

        Stream<Integer> stream1 = Stream.iterate(1, item -> item + 2).limit(6);

//        System.out.println(stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());

//        System.out.println("----------");

//        stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).min().ifPresent(System.out::println);
//        stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);

        System.out.println("----------");

        // 找出大于2的元素，将每个元素*2，忽略前两个元素，再取前两个元素，
        IntSummaryStatistics statistics = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
    }
}
