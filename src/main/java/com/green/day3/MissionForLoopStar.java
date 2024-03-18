package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args){
        //int star = 3~10 랜덤한 값이 star에 대입되도록 하라.
        int star = (int)(Math.random()*8)+3;
        System.out.println("별 갯수 : " + star);
        for(int i=0;i<star;i++) {
            System.out.print("*");
        }
        System.out.println("\n별 갯수 : " + star);
        for(int i=star;i>0;i--) {
            System.out.print("*");
        }

        /*for(int i=9;i>0;i-=2) {
            System.out.print(i + " ");
            for (int k=0;k<(9-i);k+=2){
                System.out.print(" ");
            }
                for (int j=0;j<i;j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=3;i<10;i+=2) {
            System.out.print(i + " ");
            for (int k=0;k<(9-i);k+=2){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}