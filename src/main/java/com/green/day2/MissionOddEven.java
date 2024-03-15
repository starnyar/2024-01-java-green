package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) + 1;

        // -- num이 만약 5면 --
        // 콘솔에 출력이 "5는 홀수입니다."

        // -- num이 만약 10이면 --
        // 콘솔에 출력이 "10은 짝수입니다."

        if (num % 2 == 1) {
            System.out.println(num + "은(는) 홀수입니다.");
        } else {
            System.out.println(num + "은(는) 짝수입니다.");
        }
    }
}
