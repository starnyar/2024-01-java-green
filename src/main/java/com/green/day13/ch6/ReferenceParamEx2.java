package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = { 10, 20 };

        System.out.println("intArr[0] : " + intArr[0] + " intArr[1] : " + intArr[1]);

        change(intArr);

        System.out.println("intArr[0] : " + intArr[0] + " intArr[1] : " + intArr[1]);
    }

    protected static void change(int[] param) {
        for(int i = 0; i < param.length; i++) {
            param[i] += 1;
        }
    }
}
