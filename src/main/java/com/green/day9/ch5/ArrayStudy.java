package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;

        int[] numArr = new int[10];
        int[] numArr2 = { 10, 20, 30, 40, 50 };
        int[] numArr3 = new int[] { 10, 20, 30 };

        String[] strArr = new String[5];

        System.out.println("numArr[0]: " + numArr[0]);
        numArr[0] = 11;
        System.out.println("numArr[0]: " + numArr[0]);

        System.out.println("numArr2[1]: " + numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1]: " + numArr2[1]);

        /*
        배열을 사용하는 이유? 같은 타입의 여러 값을 편하게 쓰기/읽기 하기 위해서.
        배열의 특징?
        1. 크기는 고정 (생성 후 크기 변경 X)
        2. Index로 사용한다.
        3. Index는 0번부터 시작된다.
        4. 마지막 Index값은 배열 크기 -1 값이다.
         */

    }
}
