package com.green.day9.ch5;

public class MissionArray2 {
    public static void main(String[] args) {
        /*
        정수값 10개 저장할 수 있는 배열 생성
        10칸 초기화 하는데 10~30 랜덤값 값이 세팅될 수 있도록 해주세요.
        (중복 허용)
         */

        int[] intArray = new int[10];
        intArray[0] = (int)(Math.random()*21)+10;

        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 21) + 10;
        }

        System.out.print(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            System.out.print(", " + intArray[i]);
        }
    }
}
