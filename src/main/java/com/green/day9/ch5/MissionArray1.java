package com.green.day9.ch5;

public class MissionArray1 {

    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40};

//        Q1) for문 활용 10, 20, 30, 40, (출력)
        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + ", ");
        }

        System.out.println();

//        Q2) for문 활용 10, 20, 30, 40 (출력)
        int lastIndex = numArr.length-1;
        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + (i < lastIndex ? ", " : ""));
        }
        System.out.println();


        // 성능 굿이라고 함..
        System.out.print(numArr[0]);
        for(int i = 1; i <numArr.length; i++) {
            System.out.print(", " + numArr[i]);
        }
    }
}