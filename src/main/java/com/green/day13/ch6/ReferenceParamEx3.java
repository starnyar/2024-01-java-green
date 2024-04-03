package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // [3, 2, 1, 6, 5, 4, 10]

        int[] arr2 = {};
        System.out.println(Arrays.toString(arr2));
        printIntArr(arr2);
    }

    public static void printIntArr(int[] param) {
        System.out.print("[");
        for(int i = 0; i < param.length; i++) {
            System.out.print(param[i] + (i < param.length-1 ? ", " : ""));
        }
        System.out.print("]");
    }
}
