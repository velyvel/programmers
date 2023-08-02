package com.company.Calendar;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        // month 계산할 때 0월부터 11월까지 계산하니 +1을 꼭 해주자
        System.out.println(cal.get(Calendar.MONTH) +1 );
        System.out.println(cal.get(Calendar.DATE));
        //시간에 대한 정보?
        System.out.println(cal.get(Calendar.HOUR));
        //24시간으로 표현하기
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        //5시간 후로 바꾸기, 마이너스 사용하면 전으로 바꿈
        cal.add(Calendar.HOUR, 5);
        System.out.println("바뀐시간  " + cal.get(Calendar.HOUR));

    }
}
