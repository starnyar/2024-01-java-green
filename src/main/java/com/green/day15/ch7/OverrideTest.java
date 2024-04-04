package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.attack();
        Parent parent = new Parent(55);

        child.doubleAttack();
    }
}

class Parent {
    int age;

    Parent() {}; // Child가 Parent를 상속받을 때 기본생성자가 없어서 오류가 났었음. > 기본 생성자를 만들어야함. (super(); 때문)
                // or 상속받은 Child 의 super()에 super(파라미터)를 보내야 함.

    Parent(int ageParam) { // 생성자의 특징 > 리턴 타입이 없다. 이름이 클래스 명과 같다.
        super(); // 무조건 최상위에 있어야 한다. 안적혀있어도 자동으로 적용해준다.
        this.age = ageParam; // this. 으로 접근할 수 있는 건 전역변수와 메소드밖에 없다.
    }

    public void defence() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}

class Child extends Parent {
    int mzPower;

    public Child() {
        super(); // 내 직속 부모의 기본생성자를 호출하겠다는 의미.
        // this(); 객체를 생성할 때만 쓸 수 있음. 생성자 호출할 때! 한 번 사용 가능. 생성자 호출은 생성자만 할 수 있음.
    }

    public void attack() {
        System.out.println("자식이 적을 공격한다.");
//        this.attack(); // 무한루프 돔
    }

    public void doubleAttack() {
        this.defence(); // 현재 클래스인 Child의 defence를 찾은 후 없으면 상속받은 클래스에서 찾음
        defence(); // 생략할 시 this.defence(); 임
        super.defence();; // 무조건 상속받은 클래스에서 찾음
    }
}
