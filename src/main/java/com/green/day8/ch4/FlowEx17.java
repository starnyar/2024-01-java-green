package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        /*
        Scanner를 이용하여 정수를 입력받는다.
        가이드 내용 "*을 출력할 라인의 수를 입력하세요 >>"

        만약 정수 값이 3이라면
        *
        **
        ***

        만약 정수 값이 5라면
        *
        **
        ***
        ****
        *****
         */
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        scan.close();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            if (i != star-1) System.out.println();
        }
    }
}
