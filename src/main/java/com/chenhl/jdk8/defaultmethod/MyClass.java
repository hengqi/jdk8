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
