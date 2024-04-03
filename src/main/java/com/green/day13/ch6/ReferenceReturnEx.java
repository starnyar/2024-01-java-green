package com.green.day13.ch6;
// p.268
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Numbox nb = new Numbox();
        nb.num = 10;
        Numbox nb2 = myCopy(nb);

        System.out.println("nb.num : " + nb.num); // 10
        System.out.println("nb2.num : " + nb2.num); // 10

        nb.num = 100;

        System.out.println("nb.num : " + nb.num); // 100
        System.out.println("nb2.num : " + nb2.num); // 10
    }

    public static Numbox myCopy(Numbox param) {
        Numbox temp = new Numbox();
        temp.num = param.num;
        return temp;
    }
}
