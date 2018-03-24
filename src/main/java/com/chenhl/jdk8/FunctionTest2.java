package com.chenhl.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();

        System.out.println(test2.compute(2, v -> v * 3, v -> v * v));//12
        System.out.println(test2.compute2(2, v -> v * 3, v -> v * v));//36

        System.out.println(test2.compute3(1, 2, (v1, v2) -> v1 + v2));
        System.out.println(test2.compute3(1, 2, (v1, v2) -> v1 - v2));
        System.out.println(test2.compute3(1, 2, (v1, v2) -> v1 * v2));
        System.out.println(test2.compute3(1, 2, (v1, v2) -> v1 / v2));

        System.out.println(test2.compute4(2, 3, (v1, v2) -> v1 + v2, v -> v * v));
    }

    public int compute(int a, Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.compose(f2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.andThen(f2).apply(a);
    }


    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
