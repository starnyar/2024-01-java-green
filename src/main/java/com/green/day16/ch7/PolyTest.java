package com.green.day16.ch7;
/*
<다형성 대전제 3가지>
    1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
    2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
    3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
 */
public class PolyTest {
    public static void main(String[] args) {
        // 1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다. (자동형변환)
        Animal ani_1 = new Dog();
        Animal ani_2 = new BullDog();
        Animal ani_3 = new Cat();
        Dog dog_1 = new BullDog();

        // 2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
//        Dog dog_2 = new Animal();
//        Dog dog_3 = (Dog)new Animal(); //강제형변환 ,.ClassCastException 에러

        // 3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
        ani_1.crying(); // Animal ani_1 = new Dog(); 로 개의 주소값으로 객체 생성했으니 "강아지가 멍멍" 출력
        //ani_1.sleep(); // Animal 타입이라 Dog객체주소를 가지고있어도 Dog타입에만 있는 sleep메소드 실행 불가능
        Dog dog_4 = (Dog)ani_1; // Dog타입으로 강제 형변환
        dog_4.sleep();

        //형변환 해서 쓸거면 최대한 상위 부모를 사용하는게 좋다.
        Dog dog_5 = (Dog)ani_2;
        dog_5.sleep();

        BullDog bullDog1 = (BullDog)ani_2;
        bullDog1.sleep();
        System.out.println("---------------------종료---------------------");

    }
}

class Animal {
    void crying(){};
}

class Dog extends Animal {
    @Override
    void crying() {
        System.out.println("강아지가 멍멍");
    }

    void sleep() {
        System.out.println("강아지가 잔다");
    }
}

class BullDog extends Dog {
    @Override
    void crying() {
        System.out.println("불독이 월월");
    }

    void sleep() {
        System.out.println("불독이 잔다");
    }
}

class Cat extends Animal {
    @Override
    void crying() {
        System.out.println("고양이가 야옹");
    }
}