package com.company.javaMethod;

public class StringBackward {
    // 문자열 뒤에서부터 자르기
    public String stringBackward(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n,my_string.length());
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        StringBackward backward = new StringBackward();
        backward.stringBackward("ProgrammerS123", 3);
        backward.stringBackward("He110W0r1d", 5);
        // 뒤에서부터 6글자 공백 포함헤서 실행된다 끼룩
        backward.stringBackward("거꾸로 빼주는데 공백은 ?", 6);


    }
}
