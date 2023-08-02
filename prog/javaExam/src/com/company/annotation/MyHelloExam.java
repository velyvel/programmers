package com.company.annotation;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) throws NoSuchMethodException {
        MyHello hello = new MyHello();

        Method method =  hello.getClass().getDeclaredMethod("hello");
        // get class 는 클래스에 대한 정보를 얻고 hello에 대한 메서드 객체 정보 구해라 이거임..

    }
}
