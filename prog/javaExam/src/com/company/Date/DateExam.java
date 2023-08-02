package com.company.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("데이트 스트링값 " + date.toString());
        System.out.println("현재시간을 long으로 " + date.getTime());
        //System.out.println(date.after(4));

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY.MM.dd 'at' hh:mm:ss a");
        System.out.println("데이트 포맷값 " +dateFormat.format(date));

        //system 의 현재값을 long 값으로 나에게 달라
        long today = System.currentTimeMillis();
        System.out.println("system 의 현재값을 long 값으로 " +today);
        System.out.println("코드 실행사이에 걸린 시간 " + (today - date.getTime()));
    }
}
