package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    static int[] numArr = new int[10];
    // 배열에 값을 넣는 메소드
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            numArr[i] = i + 1;
        }

//        for(int i=0; i<10; i++) {
//            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
//        }
        System.out.println(numArr.length);
        System.out.println(Arrays.toString(numArr));
    }
}
