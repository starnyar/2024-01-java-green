package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.add(10, 20);
        mm.minus(100,50);
        mm.minus(200,50);
        System.out.println(mm.returnAdd(500, 600));
        int result = mm.returnAdd(500, 600);
    }
}

class MyMath {
    // 리턴 메소드, void 메소드
    // 리턴 메소드 > 값을 리턴해주는 메소드
    // void 메소드 > 아무것도 리턴하지 않고 자체적으로 완료시켜버리는 메소드

    // static이 안붙어있으면 설계도니 사용하려면 객체화부터 해야한다.
    // 메소드의 구성요소 : 리턴타입, 메소드명, 파라미터
    // 파라미터(매개변수) > 메소드 선언부
    // {  } 부분은 > 메소드 구현부

    void method1() {

    }

    int method2() {
        return 10;
    }

    void add(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }

    void minus(int n1, int n2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
    }

    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }
}
