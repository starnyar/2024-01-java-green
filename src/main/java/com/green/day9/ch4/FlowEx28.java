package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    /*
    1~100 사이의 랜덤 값을 만들어 내고
    1~100 사이의 정수를 입력하세요 >>
    입력한 숫자보다 정답이 크다 > "Up"
    입력한 숫자보다 정답이 작다 > "Down"
    맞출 때까지 반복한다.
     */
    public static void main(String[] args) {
        int random = (int)(Math.random()*100)+1;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            int input = scan.nextInt();

            if (input < 0 || input > 100) {
                System.out.println("1~100 사이의 정수여야 합니다. ");
                continue;
            }

            if (input == random) {
                scan.close();
                break;
            }

            System.out.println(input < random ? "Up" : "Down");
        }
        System.out.println("정답은 " + random + "입니다!");
    }
}
