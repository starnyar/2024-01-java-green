package com.green.day8.ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        /*
        1 ~ 1000
        값들을 계속 더하는데, 더한 값이 100 미만인 index값이 몇인지 구하시오.
         */
        int i = 1;
        int sum = 0;

        while(true) {
            sum += i;
            System.out.println("i 값 : " + i +" sum 값 : " + sum);
            if (sum + (i + 1) >= 100) break;
            i++;
        }
        System.out.print(i + " ");
    }
}
