package com.green.day13.ch6;
//p.264
public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;
        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num); // 객체화를 안했으니 static
        System.out.println("num : " + num);

        changeNum(nb);
        System.out.println("nb.num : " + nb.num);

        System.out.println(changeNum1(nb) == nb);
    }

    public static void changeNum(Numbox param) {
        param.num = 100;
    }

    public static Numbox changeNum1(Numbox param) {
        return param;
    }

    public static void changeNum(int param) {
        param = 100;
    }
}

class Numbox {
    int num;
}

