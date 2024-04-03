package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 25, 35}
                , {30, 30, 30}
                , {40, 40, 40}
        };

        int sum = 0;
        int[] sumArr = new int[score[0].length];

        for (int i = 0; i < score[0].length; i++) {
            for (int j = 0; j <score.length; j++) {
                sum += score[j][i];
            }
            System.out.println(i + "칸의 합계값 : " + sum + " , 평균값 : " + (double)sum/score.length);
            sum = 0;
        }

//        for (int i = 0; i < score.length; i++) {
//            for (int z = 0; z < score[0].length; z++) {
//                sumArr[z] += score[i][z];
//            }
//        }

    }
}
