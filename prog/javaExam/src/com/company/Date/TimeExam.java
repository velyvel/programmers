package com.company.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 가지고 있는 객체
        LocalDateTime timePoint = LocalDateTime.now();
        //2023-07-27T14:31:18.470746 이렇게 출력됨
        System.out.println(timePoint);

        //2023-07-19 이렇게 출력됨
        LocalDate localDate1 = LocalDate.of(2023, 07,19);
        LocalDate localDate2 = LocalDate.of(2023, Month.JULY,19);
        System.out.println(localDate1);
        System.out.println(localDate2);

        //17:18 이렇게 출력이 되버림
        LocalTime localTime = LocalTime.of(17,18);
        System.out.println("localTime 출력은 " + localTime);

        LocalTime localTime2 = LocalTime.parse("10:15:30");
        System.out.println(localTime2);

        //로컬데이터 타임 ==> 로컬데이트로 변환하여 자르기
        LocalDate dateTimeToLocalDate =  timePoint.toLocalDate();
        System.out.println(dateTimeToLocalDate);
        System.out.println(timePoint.getMonthValue());
        System.out.println(timePoint.getMonth());
        System.out.println(timePoint.getMinute());
        // 시간은 24시간으로 출력함
        System.out.println(timePoint.getHour());
        // jan feb 이렇게 출력하려면?.?
        //Month month = timePoint.getMonthValue();
        // 이러면 오류남
    }

}
