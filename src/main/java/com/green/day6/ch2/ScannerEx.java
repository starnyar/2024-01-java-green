package com.green.day6.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 자리 정수를 하나 입력해주세요. >> "); // "123" > 123 문자열을 정수로 바꾸기
        String input = scan.nextLine();
        //int num = (int)input; /String은 참조 int는 원시 라서 안된다.
        int num = Integer.parseInt(input); //파싱 작업을 통해 문자열을 정수로 변환
        System.out.println("num : " + num);
        System.out.println("num + 1 : " + num);
    }
}
