package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();


        //bullDog에 들어있는 객체가 Dog로 형변환 하는 것이 가능하면 true / 아니면 false
        boolean r = bullDog instanceof Dog;
        System.out.println("bullDog instanceof Dog : " + r);
        //Dog(자식)은 부모(animal)를 담을 수 없으므로 false
        Animal ani = new Animal();
        System.out.println("ani instance of Dog: " + (ani instanceof Dog));
        //Bulldog(자식)은 부모(Dog)에 속해있으므로 true
        ani = new BullDog();
        System.out.println("ani instance of Dog: " + (ani instanceof Dog));

    }
}
