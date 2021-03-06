package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        PredicateTest2 test2 = new PredicateTest2();
//        test2.conditionFilter(list, item -> item % 2 == 0);
//        System.out.println("-------");
//        test2.conditionFilter(list, item -> item % 2 != 0);
//        System.out.println("-------");
//        test2.conditionFilter(list, item -> item > 5);
//        System.out.println("-------");
//        test2.conditionFilter(list, item -> item < 3);
//        System.out.println("-------");
//        test2.conditionFilter(list, item -> true);
//        System.out.println("-------");
//        test2.conditionFilter(list, item -> false);

//        System.out.println("-------");
//        test2.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);
//        System.out.println("-------");
////        System.out.println(test2.isEqual("test").test("test"));
//        System.out.println(test2.conditionFilter3(list, item -> item > 105, item -> item % 2 == 5));



    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
//            if (predicate1.and(predicate2).negate().test(integer)) {
            if (predicate1.or(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }


    public List conditionFilter3(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        return list.stream().filter(item -> predicate1.or(predicate2).test(item)).collect(Collectors.toList());
    }

}
