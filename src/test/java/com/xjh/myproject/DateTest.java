package com.xjh.myproject;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * @author 123
 */
public class DateTest {

    @Test
    public void dateTest(){
        //获取当前日期，没有时间
        LocalDate nowDate = LocalDate.now();
        int year = nowDate.getYear();
        int month = nowDate.getMonthValue();
        int day = nowDate.getDayOfMonth();
        System.out.println(year + "年" + month + "月" + day + "日");
        //plus方法，在当前日期的基础上加 具体的天/月/年, ChronoUnit.DAYS/MONTHS/YEARS
        //minus方法,在当前日期的基础上减去 具体的天/月/年, ChronoUnit.DAYS/MONTHS/YEARS
//        LocalDate minusDate = nowDate.minus(1, ChronoUnit.DAYS);
        LocalDate plusDate = nowDate.plus(1, ChronoUnit.DAYS);
        System.out.println(plusDate);

        //获取当前时间,没有日期
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        //获取当前的日期和时间
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
    }

    @Test
    public void calculateDateTest(){
        //计算两个日期是否是同一天
        LocalDate now = LocalDate.now();
        //LocalDate.of()方法处理特定日期,传入年月日参数，创建任意的日期
        LocalDate date = LocalDate.of(2021, 11, 11);
        if (date.equals(now)){
            System.out.println("是同一天");
        }else {
            System.out.println("不是同一天");
        }

        //检查某个日期是否是生日日期
        LocalDate dateOfBirth = LocalDate.of(1999, 1, 4);
        //获取生日日期的月和日
        MonthDay birthDay = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        //将生日日期的月和日与当前日期的月和日相比较
        MonthDay currentDay = MonthDay.from(now);
        if (currentDay.equals(birthDay)){
            System.out.println("祝您今天生日快乐");
        }else {
            System.out.println("抱歉,今天不是您的生日");
        }

        /*
             LocalDate 类有两类方法 isBefore() 和 isAfter() 用于比较日期。
             调用 isBefore() 方法时，如果给定日期小于当前日期则返回 true。
         */
        if (date.isBefore(now)){
            System.out.println("给定的日期是今天之前的日期");
        }

        if (date.isAfter(now)){
            System.out.println("给定的日期是今天之后的日期");
        }

        //计算两个日期相差的天数和月数
        if (date.isBefore(now)){
            Period period = Period.between(date, now);
            int months = period.getMonths();
            int days = period.getDays();
            System.out.println("已经过去了" + months + "个月" + days + "天");
        }

    }

}
