package com.chenhl.jdk8.stream;

import java.util.stream.IntStream;

public class StreamTest8 {

    public static void main(String[] args) {
//        IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(6).forEach(System.out::println);
        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}

/*
    1. 和迭代器不同的是，Stream可以并行化操作，迭代器只能命令式的串行化操作
    2. 当使用串行化方式去遍历时，每个item读完后再读下一个元素
    3. 使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出
    4. Stream的并行操作依赖于Java7的Fork/Join框架




    集合与流的本质区别：
    集合关注的是数据与数据存储本身
    流关注的则是对数据的计算

    流与迭代器类似的一点是流是无法重复使用或消费的。

    流的中间操作，都会返回一个Stream对象
    流的终止操作，都不会返回Stream对象，可能不返回值，也可能返回其他类型的值。

 */
