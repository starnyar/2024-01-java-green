package com.green.day19;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        // split >> regex 기준으로 잘라서 배열에 넣음.
        String[] strArr = str.split(" ");
        System.out.print("strArr : " + Arrays.toString(strArr));
        System.out.println();

        int[] intArr = new int[strArr.length];
        int idx = 0;
        for(String a : strArr) {
            intArr[idx] = Integer.parseInt(a);
            idx++;
        }
        System.out.println("intArr : " + Arrays.toString(intArr));
        System.out.println("--------------------------------");

    }
}
class Exam {

}
