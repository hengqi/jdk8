# 深入学习JDK8

## 何为Lambda表达式
 * Lambda: In programming languages such as Lisp, Python and Ruby lambda is an operator
 used to denote anonymous functions or closures, following the usage of lambda calculus
 
## 为何需要Lambda表达式
 * 在Java中，我们无法将函数作为参数传递给一个方法，也无法声明返回一个方法
 * 在JavaScript中，函数参数是一个函数，返回值是另一个函数的情况是非常常见的；JavaScript是一门非常典型的函数式语言
 
## 函数式接口
 * 如果一个接口只有要给抽象方法，那么该接口就是一个函数式接口
 * 如果我们在某个接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要求该接口
 * 如果某个接口只有一个抽象方法，但我们并没有给该接口声明FunctionalInterface注解，那么编译器依旧会将该接口看作是函数式接口
 * 函数式接口的实例可以通过lambda表达式，方法引用，或者是构造方法引用来创建
 
## Lambda表达式作用
 * Lambda表达式为Java添加了缺失的函数式编程特性，使我们能将函数当作一等公民看待
 * 在将函数作为一等公民的语言中，Lambda表达式的类型是函数，**但在Java中，Lambda表达式是对象**，他们必须依附于一类特定的对象类型--函数式接口
 * 传递行为，而不仅仅是值
   * 提升抽象层次
   * API重用性更好
   * 更加灵活
   
## Java Lambda基本语法
 * Java中的Lambda表达式的基本语法
   * (argument) -> {body}
   * 比如说
      * (arg1, arg2...) -> {body}
      * (type1 arg1, type arg2...) -> {body}
      
 * Lambda表达式示例
   * (int a, int b) -> {return a + b;}
   * () -> System.out.println("Hello World");
   * (String s) -> {System.out.println(s);}
   * () -> 42
   * () -> {return 3.1415}
   
 * 一个Lambda表达式可以有零个或多个参数
 * 参数的类型既可以明确声明，也可以根据上下文来推断。例如：(int a)与(a)效果相同
 * 所有参数需包含在圆括号内，参数之间用逗号相隔。
 * 空圆括号代表参数集为空。
## 外部迭代
 * java8之前的迭代都是外部迭代
 
##
 * 内部迭代，就是不使用迭代器，直接使用集合内部的接口迭代，比如`list.forEach();`
 
 
## Java Lambda概要
 * Java Lambda表达式是一种匿名函数；它是没有声明的方法，即没有访问修饰符，返回值声明和名字
 
## JDK自带的常用的函数式接口

### 1. `Consumer<T>`
 > 接收一个参数，不返回值。  
 > 函数式方法 `void accept(T t);` 
 
### 2. `Function<T, R>`
 > 接收一个T类型的参数，返回一个R类型结果。  
 > 函数式方法 `R apply(T t);`
 
### 3. `BiFunction<T, U, R>`
 > 接收一个T类型的参数和一个U类型的参数，返回一个R类型结果。  
 > 函数式方法 `R apply(T t, U u);`
 
### 4. `Predicate<T>`
 > 接收一个T类型的参数，返回一个boolean类型结果。  
 > 函数式方法 `boolean test(T t);`
 
### 5. `Supplier<T>`
 > 不接收参数，返回一个T类型结果。  
 > 函数式方法 `T get();`
 
### 6. `BinaryOperator<T>`
 > `BiFuction`接口的一个子接口  
 > 接收两个相同类型的参数，返回一个与参数类型相同的结果。  
 > 函数式方法 `T apply(T t1, T t2);`
 
