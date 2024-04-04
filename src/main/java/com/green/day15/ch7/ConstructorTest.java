package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}

class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }
}

class Tiger extends Animal {
    String name;

    Tiger() {
//        super(); // 오류 터짐. 이유 : 부모에 기본생성자가 없기 때문
        super(10);
    }

    Tiger(int age) {
//        super(); // 오류 터짐. 이유 : 부모에 기본생성자가 없기 때문
        super(age);
    }

    Tiger(int age, String name) {
        super(age);
        this.name = name;
    }
}
