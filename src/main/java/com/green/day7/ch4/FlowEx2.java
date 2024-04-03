package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    /*
     * Scanner 객체를 이용하여 콘솔에서 문자열값을 가져온다.
     * 받은 문자열을 숫자로 파싱한다.
     * 파싱한 숫자가 0이라면 >> 입력하신 숫자는 0입니다. (출력)
     *             0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
     *                           입력하신 숫자는 ? 입니다. (출력)
     * */
    public static boolean isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
            return true;
        } catch(NumberFormatException ex) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 >> ");
        String input = scan.nextLine();

        if (isInteger(input)) {
            int parse = Integer.parseInt(input);
            if (parse == 0) {
                System.out.println("입력하신 숫자는 0입니다.");
            } else {
                System.out.println("입력하신 숫자는 0이 아닙니다.\n입력하신 숫자는 " + parse + " 입니다.");
            }
        } else {
            System.out.println("정수가 입력되어야 합니다.");
        }

        // switch case 0 : default :
    }
}
