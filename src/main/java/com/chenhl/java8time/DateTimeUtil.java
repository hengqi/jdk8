package com.chenhl.java8time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日期时间的转换工具类
 */
public class DateTimeUtil {

    /**
     * java.util.Date --> java.time.LocalDateTime
     * @param date
     * @return
     */
    public static LocalDateTime UDateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
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


    /**
     * 将LocalDateTime转为自定义的时间格式的字符串
     * @param localDateTime
     * @param format
     * @return
     */
    public static String getDateTimeAsString(LocalDateTime localDateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDateTime.format(formatter);
    }

    /**
     * 将某时间字符串转为自定义时间格式的LocalDateTime
     * @param time
     * @param format
     * @return
     */
    public static LocalDateTime parseStringToDateTime(String time, String format) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(time, df);
    }


    /**
     * 将long类型的timestamp转为LocalDateTime
     * @param timestamp
     * @return
     */
    public static LocalDateTime getDateTimeOfTimestamp(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * 将LocalDateTime转为long类型的timestamp
     * @param localDateTime
     * @return
     */
    public static long getTimestampOfDateTime(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return instant.toEpochMilli();
    }


    /**
     * 获取当天开始时间
     * @param date
     * @return
     */
    public static Date getStartOfDay(Date date) {
        LocalDateTime dayStart = LocalDateTime.of(UDateToLocalDate(date), LocalTime.MIN);//当天零点
        return LocalDateTimeToUdate(dayStart);
    }

    /**
     * 获取当天结束时间
     * @param date
     * @return
     */
    public static Date getEndOfDay(Date date) {
        LocalDateTime dayEnd = LocalDateTime.of(UDateToLocalDate(date), LocalTime.MAX);//当天零点
        return LocalDateTimeToUdate(dayEnd);
    }


    /**
     * 根据账期类型periodType，开始时间gmtStart，跨度settlementPeriod计算一个截止日期
     * @param periodType
     * @param gmtStart
     * @param settlementPeriod
     * @return
     */
//    public static Date getGmtEnd(String periodType, Date gmtStart, long settlementPeriod) {
//        LocalDateTime localDateTimeGmtStart = DateTimeUtil.UDateToLocalDateTime(gmtStart);
//        Date gmtEnd;
//        switch (periodType) {
//            case HermesBillConstant.SETTLEMENT_PERIOD_TYPE_DAY:
//                gmtEnd = DateTimeUtil.LocalDateTimeToUdate(localDateTimeGmtStart.plusDays(settlementPeriod));
//                break;
//            case HermesBillConstant.SETTLEMENT_PERIOD_TYPE_WEEK:
//                gmtEnd = DateTimeUtil.LocalDateTimeToUdate(localDateTimeGmtStart.plusWeeks(settlementPeriod));
//                break;
//            default:
//                gmtEnd = DateTimeUtil.LocalDateTimeToUdate(localDateTimeGmtStart.plusMonths(settlementPeriod));
//        }
//        return gmtEnd;
//    }





}
