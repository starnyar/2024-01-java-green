package com.green.day3;

import java.util.Scanner;

public class MissionIf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 키를 입력해주세요 >> ");
        int height = scan.nextInt();
        if(height > 161){
            System.out.println("당신은 평균보다 큽니다.");
        } else if (height < 161) {
            System.out.println("당신은 평균보다 작습니다.");
        } else {
            System.out.println("당신은 평균입니다.");
        }
        //161보다 초과면 "당신은 평균보다 큽니다"
        //161 미만이면 "당신은 평균보다 작습니다."
        //161 이면 "당신은 평균입니다."


    }
}
