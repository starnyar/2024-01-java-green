package com.green.day15.ch7;

public class FinalTest {
    public static void main(final String[] args) {
        Car c = new Car(2200);
        System.out.println(c.CC);
//        c.CC = 100; // CC는 상수라서 값 변경 안됨. 생성자 쓰면 가능
        Car c2 = new Car(3000);
        System.out.println(c2.CC);
    }
}

class Car {
    final int CC; // 생성자를 이용하면 Lazy처리가 가능하다.

    Car() {
        CC = 100;
    }

    Car(int CC) {
        this.CC = CC;
    }

    final void start() { // final 메소드는 Overriding 금지
        System.out.println("자동차 시동을 건다.");
    }
}

final class Suv extends Car { // final class는 상속 금지
//  final void start() { // final 메소드는 overriding 금지
//        System.out.println("자동차 시동을 건다.");
//    }
}