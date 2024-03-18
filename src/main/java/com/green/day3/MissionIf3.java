package com.green.day3;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요.(남/여) >>");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력해주세요 >> ");
        int height = scan.nextInt();

        // 남자 평균키 : 175, 여자 평균키 : 161
        // gender "남", 기준값이 175
        // gender "여", 기준값이 161
        // gender "남 or 여" 아니면 성별을 입력해 주세요. > 종료

        int maleAvgHeight = 175, femaleAvgHeight = 161;
        String male = "남", female = "여";
        if(male.equals(gender)) {
            System.out.print("남자 평균");
            if(height > maleAvgHeight) {
                System.out.print("보다 큽니다.");
            } else if (height < maleAvgHeight) {
                System.out.print("보다 작습니다.");
            } else {
                System.out.print(" 키입니다.");
            }
        } else if (female.equals(gender)) {
            System.out.print("여자 평균");
            if(height > femaleAvgHeight) {
                System.out.print("보다 큽니다.");
            } else if (height < femaleAvgHeight) {
                System.out.print("보다 작습니다.");
            } else {
                System.out.print(" 키입니다.");
            }
        } else {
            System.out.print("성별을 입력해주세요.");
        }
    }
}