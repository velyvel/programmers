package com.company.javaUtil;

// awt 아니고 util에 있는 것 사용할것이다.
import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        // set 과 hashset, list 와 ArrayList 는 차이점이 있군요 호로롤로
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("Kang");
        list.add("kim");

        // 3개가 출력된다. : 중복이 허용된다
        System.out.println(list.size());

        // 순서가 있기 때문에 index 를 활용할 수 있다. ==> 고로 for 문을 사용한다.
        for(String str : list){
            System.out.println(str);
        }

        for(int i = 0; i< list.size(); i++){
           String str =  list.get(i);
            System.out.println(str);
        }
    }

}
