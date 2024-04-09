package com.green.day17.ch7;

public class FinallyStudy {
    public static void main(String[] args) {
        method(2);
    }

    public static void method(int val) {
        try {
            if(val % 2 == 0) {
                return; // return이 실행 되어도, finally는 무조건 실행된다.
            }
        } catch(Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally");
        }
        System.out.println("method 종료");
    }
}
