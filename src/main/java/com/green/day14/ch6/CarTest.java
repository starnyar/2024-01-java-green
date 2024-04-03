package com.green.day14.ch6;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("White", "auto", 5);
        c1.color = "white"; // 여기 있는 c1.이랑 생성자의 this랑 같음
        System.out.println("c1.color : " + c1.color + "\tc1.gearType : " + c1.gearType + "\t\tc1.door : " + c1.door);

        Car c2 = new Car("black", "manual", 3);
        System.out.println("c2.color : " + c2.color + "\tc2.gearType : " + c2.gearType + "\tc2.door : " + c2.door);
        c2.color = "black"; // 여기 있는 c2. 이랑 생성자의 this랑 같음.

        Car c3 = new Car();
        System.out.println("c3.color : " + c3.color + "\t\tc3.gearType : " + c3.gearType + "\tc3.door : " + c3.door);

        Car c4 = new Car(c2);
        System.out.println("c4.color : " + c4.color + "\tc4.gearType : " + c4.gearType + "\tc4.door : " + c4.door);

    }
}

class Car {
    String  color;
    String  gearType;
    int     door;

    Car() {
//        this.color = "red";
//        this.gearType = "manual";
//        this.door = 5;
          this("red","manual",5);
    }

    Car(String color, String gearType, int door) {
        this.color      = color;
        this.gearType   = gearType;
        this.door       = door;
    }

    Car(Car param) {
//        this.color      = param.color;
//        this.gearType   = param.gearType;
//        this.door       = param.door;
        this(param.color, param.gearType, param.door);
    }

    void start() {
        System.out.println("차 시동을 건다.");
    }
}