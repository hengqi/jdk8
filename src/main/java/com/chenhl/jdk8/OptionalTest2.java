package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee1, employee2);
        company.setEmployeeList(employees);

        Optional<Company> optional = Optional.ofNullable(company);

//        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.emptyList()));

        Optional<Employee> optional2 = employees.stream().filter(item -> item.getName().equals("lisi")).findFirst();
        AtomicBoolean isExist= new AtomicBoolean(false);
        optional2.ifPresent( t -> isExist.set(true));
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        }

    }

    /*
    Optional 通常用来作为方法的返回值来规避空指针问题，不要作为参数，也不要作为成员变量的类型
     */
    public void test(Optional optional) {

    }
}
