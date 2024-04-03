package com.green.day8.ch4;

public class FlowEx16_1 {
    /*
    * star값이 5라면 별을 5개 가로로 출력한다. (마지막 개행)
    * *****
    *
    * star값이 3이라면 별을 3개 가로로 출력한다. (마지막 개행)
    * ***
    *
    * */
    public static void main(String[] args) {
        int star = (int)(Math.random()*5)+1;

        System.out.println("별 갯수 : " + star);
        for(int i=0;i<star;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
