package com.green.day17.ch7;
//예외를 고의로 발생시키고, 메시지 작성하여 출력가능.
public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("?? 때문에 예외 발생");
        } catch (Exception e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }
}
