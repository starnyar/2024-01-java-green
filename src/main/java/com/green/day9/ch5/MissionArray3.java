package com.green.day9.ch5;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = { 10, 20, 30 };
        /*
            스와핑, 0번칸, 2번칸 스와핑 해주세요
         */
        System.out.print("스와핑 전 : ");
        System.out.println(Arrays.toString(numArr));

        int temp = 0;
        temp = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = temp;

        System.out.print("스와핑 후 : ");
        System.out.println(Arrays.toString(numArr));
    }
}
