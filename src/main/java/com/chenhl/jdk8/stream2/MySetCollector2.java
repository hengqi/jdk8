package com.chenhl.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @Auther: chenhonglei
 * @Description:自定义收集器
 */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return () -> {
            System.out.println("----->>> 生成一个中间结果容器 <<<------");
            return new HashSet<T>();
        };

    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return (set, item) -> {
            System.out.println("accumulator: " + set  + ", " + Thread.currentThread().getName());
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            System.out.println("set1: " + set1);
            System.out.println("set2: " + set2);
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");

        return set -> {
            Map<T, T> map = new TreeMap<>();
            set.stream().forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");

//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
        /*
           如果没有加Characteristics.CONCURRENT特性，如果是并行流，表示多个线程操作多个结果容器，然后combiner函数会被调用来合并多个结果容器
         */
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
        /*
        Characteristics.CONCURRENT:表示结果容器只有一个，多个线程同时的操作同一个结果容器，combiner函数不会调用
         */
//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }


    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        for(int i = 0; i < 1; ++i) {

            List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "c", "d", "e", "f", "g");
            Set<String> set = new HashSet<>();
            set.addAll(list);

            System.out.println("set: " + set);

            Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
//            Map<String, String> map = set.stream().collect(new MySetCollector2<>());

            System.out.println(map);
        }

    }
}
