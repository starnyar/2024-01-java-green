package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        /*
        * 1, 3 > 남
        * 2, 4 > 여
        * Scanner 객체를 통해 주민번호를 입력받으시고
        * '1' > 당신은 2000년 이전에 출생한 남자입니다.
        * '3' > 당신은 2000년 이후에 출생한 남자입니다.
        * '2' > 당신은 2000년 이전에 출생한 여자입니다.
        * '4' > 당신은 2000년 이후에 출생한 여자입니다.
        * 이외 값 > "유효하지 않은 주민번호입니다." 출력
        * switch 만 사용 가능
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요 (######-#######) >> ");
        String input = scan.nextLine();
        scan.close();

        if (input.charAt(6) != '-') {
            System.out.println("올바르지 않은 주민번호 형식입니다.");
            return;
        }

        char sex = input.charAt(7);

        String result = switch (sex) {
            case '1' -> "2000년 이전에 출생한 남자";
            case '2' -> "2000년 이전에 출생한 여자";
            case '3' -> "2000년 이후에 출생한 남자";
            case '4' -> "2000년 이후에 출생한 여자";
            default -> null;
        };

        if (result != null) {
            System.out.print("당신은 " + result + "입니다.");
        } else {
            System.out.print("유효하지 않은 주민번호입니다.");
        }
    }
}
