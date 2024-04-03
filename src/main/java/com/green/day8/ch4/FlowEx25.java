package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        /*
        가이드 "숫자를 입력하세요. (예:12345) >>
        정수로 값을 받는다.
        1 + 2 + 3 + 4 + 5 결과값을 출력
        "각 자리수의 합 : 15" (출력)
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) >> ");
        int input = scan.nextInt();
        scan.close();
//        int result = 0;
//        while(input > 0) {
//            result += input % 10;
//            input /= 10;
//        }

        int result = 0;
        int inputLength = (int)(Math.log10(input)+1);
        for(int i=0;i<inputLength;i++){
            result += input % 10;
            input /= 10;
        }
        System.out.print("각 자리수의 합 : " + result);
    }
}
