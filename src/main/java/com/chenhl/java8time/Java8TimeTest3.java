package com.chenhl.java8time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Auther: chenhonglei
 * @Date: 2018/10/8 17:19
 * @Description:
 */
public class Java8TimeTest3 {

    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        LocalDate localDate1 = DateTimeUtil.UDateToLocalDate(now);
        System.out.println(localDate1);

        String s = "2018-10-08 17:40:40";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = format.parse(s);
        LocalDate localDate2 = DateTimeUtil.UDateToLocalDate(d2);
        System.out.println(localDate2);
        System.out.println(localDate1.equals(localDate2));

//        LocalDateTime localDateTime1 = DateTimeUtil.UDateToLocalDateTime(now);
//        System.out.println(localDateTime1);
//        System.out.println(localDateTime1.getYear());
//        System.out.println(localDateTime1.getMonthValue());
//        System.out.println(localDateTime1.getDayOfMonth());
//        System.out.println(localDateTime1.getHour());


    }
}
