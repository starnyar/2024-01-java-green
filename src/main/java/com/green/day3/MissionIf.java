package com.green.day3;

import java.util.Scanner;

public class MissionIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요.(남/여) >>");
        String gender = scan.nextLine();
        if("남".equals(gender)) {
            System.out.println("당신은 남자입니다.");
        } else if ("여".equals(gender)) {
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("성별을 입력해 주세요.");
        }
        //지금까지 배운 것으로 해결

        //만약 "남" > "당신은 남자입니다"
        //만약 "여" > "당신은 여자입니다"
        //만약 "남, 여"도 아니면 "성별을 입력해 주세요."
    }
}
