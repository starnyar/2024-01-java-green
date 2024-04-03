package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    /*
    * 무식하게 해결 요망!!!
    * Scanner 를 통해 점수를 입력받으세요.
    * 점수는 정수로 바로 받으시고,
    * grade(학점)을 관리할 문자 타입을 선언해주세요.
    * symbol(+-0) 저장할 문자 타입 선언해주세요.
    * 만약 점수가 90점 이상이면 grade 에 A값을 저장하고
    * 만약 점수가 80점 이상이면 grade 에 B값을 저장하고
    * 1점대가 0~2 -
    *        3~6 0
    *        7~9 +
    * 나머지는 C학점 오로지 C학점
    * (출력) 당신의 학점은 ?입니다.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 (0 ~ 100) >> ");
        String input = scan.nextLine();
        // return 값 score : 정상 // -1 : 에러
        int score = FlowEx4.scoreExceptionString(input, 1);
        if (score == -1) { return; }
        // int score = scan.nextInt();
        // 0~100 예외처리
        // if (!FlowEx4.scoreExceptionInt(score)){ return; }

        String grade  = "C";
        String symbol = "0";

        if      (score >= 90)   {grade = "A";}
        else if (score >= 80)   {grade = "B";}

        if (score == 100) {
            symbol = "+";
        } else if ((grade.equals("A") || grade.equals("B"))) {
            switch(score % 10) {
                case 0, 1, 2    -> symbol = "-";
                case 3, 4, 5, 6 -> symbol = "0";
                case 7, 8, 9    -> symbol = "+";
            }
        }
        System.out.print("당신의 학점은 " + grade + symbol + " 입니다.");
    }
}
