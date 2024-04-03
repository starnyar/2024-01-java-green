package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {

        //int star = 3~7 사이의 랜덤값

        int star = (int)(Math.random()*5)+3;
        System.out.println("star = " + star);
        for(int i=0;i<star;i++) {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //9부터
        /*for(int i=9;i>0;i-=2) {
            System.out.print(i + " ");
            for (int k=0;k<(9-i);k+=2){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        
        //1부터
 /*       for(int i=1;i<10;i+=2) {
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
