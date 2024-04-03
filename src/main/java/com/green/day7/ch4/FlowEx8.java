package com.green.day7.ch4;

import java.util.Scanner;

/*
* 1, 3 > 남
* 2, 4 > 여
* Scanner 객체를 통해 주민번호를 입력받으시고
* 주민번호를 확인하여 "여자" 인지 "남자" 인지 "유효하지 않은 주민번호" 인지 출력
* switch 활용
*/
public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 주민번호를 입력하세요. (format = ######-#######) >> ");
        String input = scan.nextLine();

        char number = input.charAt(7);

        String gender = switch(number) {
            case '1', '3' -> "남자";
            case '2', '4' -> "여자";
            default   -> null;
        };

        if (gender == null) {
            System.out.println("유효하지 않은 주민번호입니다.");
        } else {
            System.out.println("당신은 " + gender + "입니다.");
        }
    }
}
