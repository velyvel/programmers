package com.company.javaUtil;

public class BoxGeneric<E> {
    //E는 실제로 존재하는 클래스가 아님 == 고로 제네릭을 표현했다
    // 선언할때는 가상의 타입으로 선언해줌
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj(){
        return obj;
    }
}
