package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
//        Dog d = new Dog(); 추상클래스는 객체화 불가능
    }
}

abstract class Dog { //추상 클래스
// 추상클래스는 객체화를 하지 못하게 만들고 싶을 때 사용
// ex. 캐릭터 클래스를 상속받은 전사클래스 도적클래스 마법사클래스 > 캐릭터 클래스는 추상클래스
}

abstract class Cat {
    //추상 메소드
    //추상 메소드를 단 하나라도 가지고 있다면, 추상 클래스가 되어야 한다.
    abstract void crying();
    
    void jump() {// 추상 클래스 안에 일반 메소드도 사용 가능
        System.out.println("폴짝 폴짝");
    }
}

class KoreaShort extends Cat { //추상클래스를 상속받으면 처음에 빨간 줄이 나옴.
    @Override
    void crying() { // 추상 메소드를 실체화 시켜야 빨간 줄이 없어짐. (추상클래스를 상속받을 경우 추상 메소드를 구현해야하는 강제성이 생긴다)
        System.out.println("야옹 야옹~");
    }
}

class AmericaCat extends Cat {
    @Override
    void crying() {
        System.out.println("미유~~ 미유~~");
    }
}