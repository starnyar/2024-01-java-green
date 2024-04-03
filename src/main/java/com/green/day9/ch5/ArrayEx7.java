package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    // 10, 11, 12, ~~~ 19
    // 셔플~
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int ran = 0;
        int temp = 0;
        int numArrLength = numArr.length;

        // Math.random() * 10을갖고있는 변수 > 0~9
        // Math.random() * 10 > 0~9

        for (int i = 0; i < numArrLength; i++) {
            numArr[i] = i+10;
        }
        System.out.println("초기 배열 값 : " + Arrays.toString(numArr));

        for(int i = 0; i < numArrLength; i++) {
            ran = (int)(Math.random()*numArrLength);
            temp = numArr[i];
            numArr[i] = numArr[ran];
            numArr[ran] = temp;
        }
        System.out.println("섞은 배열 값 : " + Arrays.toString(numArr));
    }
}
