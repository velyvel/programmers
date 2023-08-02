package com.company.javaStudy;

import com.company.Main;

public class MathExam {
    public static void main(String[] args) {
        int value = Math.max(5,30);
        System.out.println(value);

        int value2 = Math.min(5,30);
        System.out.println(value2);
        //절댓값
        System.out.println( Math.abs(-10));
        //랜덤값: 리턴값은 더블이다.0~1.0 사이의 값 반환
        System.out.println(Math.random());
        //제곱근 구하는 메서드 : 더블 값 반환한다.
        System.out.println(Math.sqrt(25));
        //더하기
        System.out.println(Math.addExact(3,4));
        //빼기
        System.out.println(Math.subtractExact(3,1));
        //그러면 음수일때는 ?.? 마이너스로 값이 나온다
        System.out.println(Math.subtractExact(3,5));
        //하나가 감소된 메서드
        System.out.println(Math.decrementExact(5));
    }
}
