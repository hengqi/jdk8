package com.chenhl.base;

import java.math.BigDecimal;

/**
 * @Auther: chenhonglei
 * @Date: 2018/12/4 17:13
 * @Description:
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("3456.8");
        BigDecimal divide = b1.divide(BigDecimal.valueOf(1000));
        System.out.println(divide);
        System.out.println(divide.intValue());
    }
}
