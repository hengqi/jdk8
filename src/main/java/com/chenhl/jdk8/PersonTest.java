package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("zhangsan", 20);
        Person person4 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        PersonTest test = new PersonTest();

        List<Person> personList = test.getPersonsByUsername("zhangsan", people);
        personList.forEach(person -> System.out.println(person));

        System.out.println("----");

        List<Person> personsByAge = test.getPersonsByAge(20, people);
        personsByAge.forEach(person -> System.out.println(person));

        System.out.println("------");
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (paramAge, paramList) ->
                paramList.stream().filter(person -> person.getAge() >  paramAge).collect(Collectors.toList());
        List<Person> personsByAge2 = test.getPersonsByAge2(20, people, biFunction);
        System.out.println(personsByAge2);

    }

    public List<Person> getPersonsByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }


    public List<Person> getPersonsByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (paramAge, paramList) ->
           paramList.stream().filter(person -> person.getAge() >  paramAge).collect(Collectors.toList());

        return biFunction.apply(age, personList);
    }


    public List<Person> getPersonsByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, personList);
    }
}
