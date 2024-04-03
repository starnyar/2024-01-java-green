package com.green.day8.ch4;

public class FlowEx12 {
    /*
    * 반복문을 사용하여 1~5를 세로로 출력한다.
    *
    * 반복문을 사용하여 1~5를 가로로 출력한다.
    */
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }

        for(int i=1;i<=5;i++) {
            System.out.print(i + " ");
        }
    }
}
