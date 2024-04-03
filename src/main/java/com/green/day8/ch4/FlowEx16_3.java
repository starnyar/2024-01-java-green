package com.green.day8.ch4;

public class FlowEx16_3 {
    /*
    * 가로 10개
    * 세로 5개
    * 별 출력해주세요.
    */
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
