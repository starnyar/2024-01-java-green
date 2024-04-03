package com.green.day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args) {
        // 입력한 모든 숫자를 더한 값 출력
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력해주세요. (종료:0) >> ");
            input = scan.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.print("입력하신 숫자를 더한 값 : " + sum);
    }
}
