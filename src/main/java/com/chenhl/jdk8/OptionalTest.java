package com.chenhl.jdk8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) throws ParseException {
//        Optional<String> optional = Optional.of("hello");
//        Optional<String> optional = Optional.empty();
        Optional<String> optional = Optional.ofNullable("hello");

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        // 推荐的optional使用方式
        optional.ifPresent(System.out::println);

        System.out.println("---------");
        System.out.println(optional.orElse("world"));

        System.out.println("---------");
        System.out.println(optional.orElseGet(() -> "你好"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2018-07-11");
        System.out.println(parse.getTime());
    }
}
