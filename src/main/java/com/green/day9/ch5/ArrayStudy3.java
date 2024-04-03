package com.green.day9.ch5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        int[] nArr1 = { 10, 20, 30 };
        int[] nArr2 = nArr1; // 주소값이 복사됨 , {10,20,30}의 주소값이 1이라면 nArr1, nArr2 둘다 1에 접근하여 수정 가능

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;
        System.out.println(nArr2[1]);

        System.out.println(Arrays.toString(nArr1) + " " + nArr1);
        System.out.println(Arrays.toString(nArr2) + " " + nArr2);
    }
}
