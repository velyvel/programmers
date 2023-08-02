package com.company.javaMethod;

public class StringMethod {
    public String solution(String my_string, int n) {
        System.out.println(my_string.substring(0,n));
        return my_string.substring(0,n);
    }

    public static void main(String[] args) {
        StringMethod stringMethod = new StringMethod();
        // 인덱스 1부터 시작해서 3개 출력한다.
        stringMethod.solution("He110W0r1d", 3);
        stringMethod.solution("ProgrammerS",5);
        stringMethod.solution("myName2234Is",7);

        /**문자열보다 더 크게 잘랐을 때 어떻게 되는가 ?
        begin 0, end 10, length 9 라는 오류가 발생한다.*/
        //stringMethod.solution("123456789",10);

    }
}
