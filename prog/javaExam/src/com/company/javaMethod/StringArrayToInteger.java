package com.company.javaMethod;

public class StringArrayToInteger {
    /**
     * 숫자로만 되어있는 문자열(String) 정수로 변환하기
     * */
    public int stringArrayToInteger(String n_str){
        int answer = Integer.parseInt(n_str);;
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        StringArrayToInteger sat = new StringArrayToInteger();
        sat.stringArrayToInteger("1234");
        sat.stringArrayToInteger("01096037781");
        // 혹시 문자열을 넣는다면 어떻게 되버릴까 낄낄
        //number만 쓰라고 나오네요 끼룩 똑똑한 자마 ㅋㅋㅋ
        sat.stringArrayToInteger("문자열포함파서인트");
    }
}
