package com.company.javaUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "Kang");
        map.put("003", "Choi");
//        map.put("003", "Choi");
        map.put("003", "lee");

        System.out.println(map.size());
        // 마지막에 key값에 들어온 값이 저장된다
        System.out.println(map.get("003"));

       Set<String> keys = map.keySet();
       Iterator<String> iterator = keys.iterator();
       while (iterator.hasNext()){
           String key=iterator.next();
           String value=map.get(key);
           System.out.println(key + ":" + value);
       }

    }

}
