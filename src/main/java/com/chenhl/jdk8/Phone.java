package com.chenhl.jdk8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Phone {

    public static void main(String[] args) {
        List<Phone> phones = Arrays.asList(new Phone(new BigDecimal("500.90")), new Phone(new BigDecimal("508.94")), new Phone(new BigDecimal("1500.07")));


//        BigDecimal reduce = phones.stream().map(phone -> phone.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println(reduce);
//        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));

        Supplier<Phone> supplier = Phone::new;

        Phone phone = supplier.get();
        Phone phone1 = supplier.get();
        System.out.println(phone==phone1);
    }

    private BigDecimal price;

    public Phone() {
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Phone(BigDecimal price) {
        this.price = price;
    }
}
