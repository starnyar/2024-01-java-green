package com.green.day14.ch6;

import java.util.Arrays;

public class MyArrays {
    public static void printArr(int[] param) {
        System.out.print("[");
        if (param.length < 1) {
            System.out.print("]");
            return;
        }
        System.out.print(param[0]);
        for (int i = 1; i < param.length; i++) {
            System.out.print(", " + param[i]);
        }
        System.out.print("]\n");
    }

    public static String toString(int[] param) { //메소드 3대 구성요소 : 메소드명, 파라미터, 리턴타입
        if (param.length < 1) {
            return "[]";
        }
        // String.format("[%d", param[0]
        // for(int i = 1; i < param.length; i++) {
        //      str += String.format(", %d", param[i]);
        // 실무에서는 StringBuilder를 사용함
        // 문자열 합치기 성능이 많이 떨어지고, for문에서 돌지않음. << toString
        String result = "[" + param[0];
        for (int i = 1; i < param.length; i++) {
            result = result + ", " + param[i];
        }
        return result + "]";
    }
}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4,10};
        MyArrays.printArr(arr); // [3,2,1,6,5,4,10]
        String str = Arrays.toString(arr);
        System.out.println("str : " + str);

        String str2 = MyArrays.toString(arr);
        System.out.println("str2 : " + str2);
    }
}
