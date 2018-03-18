package com.chenhl.jdk8;

@FunctionalInterface
interface MyInterface {

    void test();

    /**
     * 此处的toString方法是Object类里的公有方法，所以不影响接口的抽象方法的个数。
     *
     * @return
     */
    String toString();
}

public class Test2 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
//        test2.myTest(new MyInterface() {
//            @Override
//            public void test() {
//                System.out.println("myInterface.test");
//            }
//        });

        test2.myTest(() -> System.out.println("myInterface.test"));

        System.out.println("-----");

        MyInterface myInterface = () -> System.out.println("hello");
        System.out.println(myInterface.toString());
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }

    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

}



