package com.chenhl.java8time;

import java.time.*;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class Java8TimeTest2 {

    public static void main(String[] args) {
//        System.out.println(getStartOfDay(new Date()).toLocaleString());
//        System.out.println(getEndOfDay(new Date()).toLocaleString());

        LocalDate localDateStart = LocalDate.of(2018, 8, 30);
        LocalDate localDateEnd = LocalDate.of(2018, 9, 1);

        Date date1 = LocalDateToUdate(localDateStart);
        Date date2 = LocalDateToUdate(localDateEnd);

        Stream<Date> dateStream = Stream.of(date1, date2);
//        List<Date> collect = dateStream.sorted().collect(Collectors.toList());
//        System.out.println(collect);

        Date date = dateStream.min(Comparator.naturalOrder()).orElse(new Date());
        System.out.println(date.toLocaleString());
        Date date3 = dateStream.max(Comparator.naturalOrder()).orElse(new Date());
        System.out.println(date3.toLocaleString());

    }

    public static Date getStartOfDay(Date date) {
        LocalDateTime dayStart = LocalDateTime.of(UDateToLocalDate(date), LocalTime.MIN);//当天零点
        return LocalDateTimeToUdate(dayStart);
    }

    public static Date getEndOfDay(Date date) {
        LocalDateTime dayEnd = LocalDateTime.of(UDateToLocalDate(date), LocalTime.MAX);//当天零点
        return LocalDateTimeToUdate(dayEnd);
    }

    /**
     * java.util.Date --> java.time.LocalDate
     * @param date
     * @return
     */
    public static LocalDate UDateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime.toLocalDate();
    }


    /**
     * java.time.LocalDateTime --> java.util.Date
     * @param localDateTime
     * @return
     */
    public static Date LocalDateTimeToUdate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * java.time.LocalDate --> java.util.Date
     * @param localDate
     * @return
     */
    public static Date LocalDateToUdate(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }
}
