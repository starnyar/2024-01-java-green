package com.green.day17.ch7;

public class StringToIntStudy {
    public static void main(String[] args) {
        int result = Utils.convertStringToInt("123a");
        System.out.println("result : " + result);
    }
}

class Utils {
    static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str); // Integer.parseInt() >> 문자열 안에 0~9만 있으면 파싱 가능.
        } catch (Exception e) {
            return 0;
        }
    }
}
