package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    /*
     * switch 문으로 해결
     * Scanner 객체를 사용하여 month(월) 값을 정수로 입력받는다.
     *
     * month 값이 3~5      라면 "현재의 계절은 봄입니다." (출력)
     *           6~8     이라면 "현재의 계절은 여름입니다." (출력)
     *           9~11    이라면 "현재의 계절은 가을입니다." (출력)
     *           12,1,2    라면 "현재의 계절은 겨울입니다." (출력)
     * 이외의 값은 "잘못 입력하셨습니다." (출력)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 월인지 입력해주세요. >> ");
        int month = scan.nextInt();
        //String input = scan.nextLine();
        //int month = FlowEx4.scoreExceptionString(input, 0);
        //if (month == -1) { return; }

        String monthName = switch(month) {
            case 3, 4, 5    ->  "봄";
            case 6, 7, 8    ->  "여름";
            case 9, 10, 11  ->  "가을";
            case 12, 1, 2   ->  "겨울";
            default         ->  null;
        };
        if (monthName.isEmpty() || monthName == null) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            System.out.print("현재의 계절은 " + monthName + "입니다.");
        }
    }
}
