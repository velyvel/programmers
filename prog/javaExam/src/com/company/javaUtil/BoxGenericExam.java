package com.company.javaUtil;

public class BoxGenericExam {
    // 실행할때는 다양한 타입으로 선언 : 컬랙션 프레임워크와 관련해서 사용함
    public static void main(String[] args) {
        BoxGeneric<Object> boxGeneric = new BoxGeneric<>();
        boxGeneric.setObj(new Object());
        Object obj = boxGeneric.getObj();
        System.out.println(obj);

        BoxGeneric<String> box2 = new BoxGeneric<>();
        box2.setObj("Hello");
        String str = box2.getObj();
        System.out.println(str);

        BoxGeneric<Integer> box3 = new BoxGeneric<>();
        box3.setObj(123);
        Integer integer = box3.getObj();
        System.out.println(integer);
    }
}
