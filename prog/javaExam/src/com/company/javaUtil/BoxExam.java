package com.company.javaUtil;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();
        System.out.println(obj);

        //object로 되어있을 때 형변환을 무조건 해 주어야 함
        box.setObj("Hello");
        String str = (String) box.getObj();
        System.out.println(str);

        box.setObj(1);
        int intValue = (int)box.getObj();
        System.out.println(intValue);

    }
}
