package com.green.day3;

public class ForLoop {
    public static void main(String[] args) {
        // for(초기화;조건식;증감식) { 반복코드 }
        for(int i = 0; i < 5; i++) {
            System.out.println("안녕");
        }

        //Hello 6번 출력
        for(int i=5;i<11;i++) {
            System.out.println(i-4 + ".Hello");
        }

        // 4번반복
        for(int i=100;i>96;i--) {
            System.out.println(101-i + ".Bye");
        }
    }
}
