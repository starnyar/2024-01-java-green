package com.green.day4;

public class MissionABS {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 20) - 10; //0~20 > -10~10
        System.out.println(val);

        if (val < 0) {val = -val;}
        System.out.println(val);
    }
}
