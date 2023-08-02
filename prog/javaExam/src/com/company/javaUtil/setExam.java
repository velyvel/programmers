package com.company.javaUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    //hashSet
    public static void main(String[] args) {
        // 인스턴스르르 생성하는데 set은 인터페이스이기 때문에 new를 통해 생성할수가 없었죠..
        // 그래서 set을 구현한 클래스인 hashset을 사용해 구현해봄;
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("Kang");
        boolean flag2 = set1.add("Kim");
        boolean flag3 = set1.add("Kang");
        // 크기를 알려주기
        // 2 가 출력
        System.out.println(set1.size());
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // Iterator 인터페이스 사용해야함
        // hasNext 메서드 있는데, 중복을 확인하는 메서드임
        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            // 값을 꺼내줘! 메서드임
            String str = iter.next();
            System.out.println(str);

        }
        // 혹은 foreach 문을 사용해서 꺼낼 수도 있다
        for (String str : set1) {
            System.out.println(str);
        }
    }
}
