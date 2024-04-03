package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx27 {
    /*
    가이드 출력 "합계를 구할 숫자를 입력하세요. (종료 : 0) >> "
    가이드 출력이 계속 된다. 0을 입력할때까지..
    지금까지 입력한 모든 숫자를 더한 값을 마지막에 출력한다.
    출력 포맷은 자유
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        while(true) {
            System.out.print("합계를 구할 숫자를 입력하세요. (종료 : 0) >> ");
            input = scan.nextInt();

            if (input == 0) {
                scan.close();
                break;
            }
            sum += input;
        }

        System.out.println("입력한 모든 숫자를 더한 값 : " + sum);
    }
}
