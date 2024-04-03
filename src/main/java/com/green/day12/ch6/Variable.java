package com.green.day12.ch6;

public class Variable {
    int iv; // 인스턴스 변수, 전역변수 (Global Variable)
    // 객체가 죽을 때 같이 죽는다.

    static int cv; // 클래스 변수, 스태틱 변수
    // 클래스 변수, 스태틱 변수
    // static 이 붙어있으면 객체화랑 관련이 x, 이 클래스가 객체화를 하든 안하든 상관이 없다.
    // 객체화랑 독립적이다. 객체를 수 백개 만들어도 static은 1개
    // 사용하려면 클래스 이름으로 접근해서 사용
    // 객체화를 하지 않아도 메모리 할당을 받는다.

    // 인스턴스 변수
    // static이 없으면 무조건 객체화를 해서 사용해야 한다.

    void method(int num) {
        int lv = 0; // 지역 변수 (Local Variable), 매개변수도 지역변수임.
    }
    void method2() {

    }

    static void staticMethod() {
        int lv = 0; // 지역 변수 (Local Variable)
    }
}
