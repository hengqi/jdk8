package com.chenhl.jdk8.defaultmethod;

//public class MyClass implements MyInterface1 {
//
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        myClass.myMethod();
//    }
//}

//public class MyClass implements MyInterface1, MyInterface2 {
//
//    @Override
//    public void myMethod() {
////        System.out.println("myClass");
//  当实现的两个接口里有同名的方法时，必须重写接口里的方法，如果想取特定接口里的方法，需要使用super关键字来指定实现的是哪个接口里的方法
//        MyInterface2.super.myMethod();
//    }
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        myClass.myMethod();
//    }
//}
public class MyClass extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
