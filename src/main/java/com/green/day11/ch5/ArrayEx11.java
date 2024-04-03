package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];

        /*
        Q1. numArr 모든 방에 0~9 사이의 랜덤값 넣어주세요 (중복 허용)
         */
        for (int i = 0; i < len; i++) {
            numArr[i] = (int)(Math.random()*len);
        }
        System.out.println(Arrays.toString(numArr));
        /*
        Q2. numArr 각 칸에 들어있는 값의 갯수를 counterArr에 정리한다.
        // 예를들어 [9, 8, 6, 7, 6, 6, 0, 0, 4, 2] 인 경우
        // counterArr[0]에는 2
        // counterArr[1]에는 0
        // counterArr[9]에는 1
         */

        for (int i = 0; i < len; i++) {
            counterArr[numArr[i]]++;
        }
        System.out.println();
        System.out.println(Arrays.toString(counterArr));
    }
}
