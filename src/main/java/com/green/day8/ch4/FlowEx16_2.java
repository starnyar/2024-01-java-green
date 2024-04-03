package com.green.day8.ch4;

public class FlowEx16_2 {
    /*
    * star값이 5라면 별을 5개 가로로 5줄 출력한다. (마지막 개행)
    * star값이 3이라면 별을 3개 가로로 3줄 출력한다. (마지막 개행)
    */
    public static void main(String[] args) {
        int star = (int)(Math.random()*5)+1;

        for(int i=0;i<star;i++) {
            for(int j=0;j<star;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
