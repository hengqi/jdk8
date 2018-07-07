package com.chenhl.jdk8;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        consumerTest.consumerAndThen(4, item -> System.out.println(item), v -> System.out.println(v*2));
    }


    public void consumerAndThen(int a, Consumer<Integer> c1, Consumer<Integer> c2) {
       c1.andThen(c2).accept(a);
    }
}
