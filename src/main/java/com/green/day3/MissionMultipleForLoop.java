package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args) {
        //int star = 2 ~ 6 사이의 랜덤값
        int star = (int)(Math.random()*5)+2;
        //System.out.println(star);

        for(int i=0;i<star;i++) {
            for(int j=0;j<star;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
