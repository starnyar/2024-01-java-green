package com.green.day11.ch5;

import java.sql.SQLOutput;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println("tmp : " + tmp);
        //0번방 값을 "Yu"로 변경
        names[0] = "Yu";
        System.out.println(names[0]);

        //일반 for문
        for(int i = 0; i < names.length; i++) {
            String val = names[i];
            System.out.println("val : " + val);
        }
        //향상된 for문, foreach문
        for(String val : names) {
            System.out.println("val : " + val);
        }
    }
}
