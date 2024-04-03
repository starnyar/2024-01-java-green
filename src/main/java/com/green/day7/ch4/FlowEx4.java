package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4{
    /*
    * Scanner를 통해 점수를 입력 받으세요.
    * 점수는 정수로 바로 받으시고, grade(학점)을 관리할 문자 타입을 선언해주세요.
    * 만약 점수가 90점 이상이면 grade에 A 값을 저장하고
    * 만약 점수가 80점 이상이면 grade에 B 값을 저장하고
    * 만약 점수가 70점 이상이면 grade에 C 값을 저장하고
    * 69점 이하라면 grade에 D값을 저장하세요.
    * */
    // 정수 예외처리
    static int score = 0;
    static char grade = ' ';

    public static int scoreExceptionString(String strValue, int type) {
        // type 0 : 정수 예외처리만
        // type 1 : 정수+점수 예외처리
        //정수 예외처리
        try {
            score = Integer.parseInt(strValue);
        } catch(NumberFormatException ex) {
            System.out.println("정수가 아닙니다.");
            return -1;
        }

        //점수 예외처리
        if (type == 1 && 100 < score || 0 > score) {
            System.out.println("0~100 사이의 점수가 아닙니다.");
            return -1;
        }
        return score;
    }

    public static boolean scoreExceptionInt(int intValue) {
        //점수 예외처리
        if (100 < intValue || 0 > intValue) {
            System.out.println("0~100 사이의 점수가 아닙니다.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 학점을 입력해주세요(정수) >> ");
        String input = scan.nextLine();
        scan.close(); // scan으로 사용한 메모리 반환

        score = scoreExceptionString(input, 1);
        if (score == -1) {return;} // 예외처리

        if (score >= 90)        {grade = 'A';}
        else if (score >= 80)   {grade = 'B';}
        else if (score >= 70)   {grade = 'C';}
        else                    {grade = 'D';}
        System.out.println("당신의 학점은 " + grade + " 입니다."); // 학점 생성
    }
}
