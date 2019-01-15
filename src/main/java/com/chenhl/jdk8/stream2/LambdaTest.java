package com.chenhl.jdk8.stream2;

/**
 * lambda和内部类的区别
 */
public class LambdaTest {

    Runnable r1 = () -> System.out.println(this);//com.chenhl.jdk8.stream2.LambdaTest@74bfd094

    // 匿名类
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);//com.chenhl.jdk8.stream2.LambdaTest$1@697d5cae
        }
    };


    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();

        System.out.println("--------");

        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();

    }
}

/*
    1.从运行结果来看
    t1打印的是当前类的实例的对象，
    t2打印的是一个匿名类的一个对象，该类在磁盘上是真实存在的，在Java中匿名类使用外部类$+出现的顺序来表示

    lambda表达式看起来像是匿名类的替代品，语法糖。但实际上有着本质的区别。作用域不同，匿名类是在类内部开辟了一个新的作用域，
    而lambda并没有开辟这样的作用域，它和外层类的作用域是一样的。只不过可以完成同样的工作，在编码上更简洁。

 */