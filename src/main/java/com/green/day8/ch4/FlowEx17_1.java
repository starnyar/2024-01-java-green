package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    /*
        정수값 3이면
        __*
        _**
        ***

        5면
        ____*
        ___**
        __***
        _****
        *****
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        scan.close();
        //내가 적은거
        for(int i=0; i<star; i++){
            for(int j=1; j<=star; j++){
                if( i < (star-j)) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //강사님이 적은거
        for (int i = 1; i<=star; i++) {
            for (int z=star-i; z>0; z--) {
                System.out.print("_");
            }
            for (int z=0;z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
