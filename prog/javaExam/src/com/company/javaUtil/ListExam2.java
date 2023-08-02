package com.company.javaUtil;

// awt 아니고 util에 있는 것 사용할것이다.
import java.util.ArrayList;
import java.util.List;

public class ListExam2 {

//    public List<String> addArray(){
//        String[] arr1 = {"월","화","수","목","금","토","일"};
//        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
//
//        List<String> list = new ArrayList<String>();
//        List<Integer> list2 = new ArrayList<>();
//
//        for(String str : arr1){
//            System.out.println(str);
//            //list.add(str);
//        }
//
//        for(int intVal : arr2){
//            System.out.println(intVal);
//            //list2.add(intVal);
//        }
//        return list;
//    }

    public static void main(String[] args) {
        String[] arr1 = {"월","화","수","목","금","토","일"};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};

        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<>();

        for(String str : arr1){
            //System.out.println(str);
            list.add(str);
        }

        for(int intVal : arr2){
            //System.out.println(intVal);
            list2.add(intVal);
        }

        System.out.println(list);
        System.out.println(list2);
    }

}
