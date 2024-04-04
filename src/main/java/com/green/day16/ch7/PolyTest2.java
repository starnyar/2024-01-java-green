package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        BullDog bullDog = new BullDog();

        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);
    }

    public static void doCrying(Animal ani) {
        ani.crying();

//        if(ani instanceof Dog) {
//            ((Dog)ani).sleep();
//        }

        if(ani instanceof Dog dog) { // enhanced instanceof 자바 14버전 이후로 사용 가능해진 기능. 위 if문과 똑같음!
            dog.sleep();
        }
    }
}
