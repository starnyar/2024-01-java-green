package com.green.day8.ch4;

public class FlowEx13 {
    /*
    * 1 ~ 10 전부 더한 값 과정 출력
    *
    * 1부터 1까지의 합 : 1
    * 1부터 2까지의 합 : 2
    * ...
    * 1부터 10까지의 합 : 55
    */
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=10;i++) {
            sum += i;
            System.out.println("1부터 " + i + "까지의 합 : " + sum);
        }
    }
}
