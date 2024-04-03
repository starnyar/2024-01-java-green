package com.green.day9.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        /*
        학생들의 국어 점수입니다.
        총점과 평점 출력해주세요.
         */
        int[] score = { 100, 88, 100, 100, 90 };
        int sum = 0;
        double avg = (double)sum/score.length;

        for (int eachScore : score) {
            sum += eachScore;
        }

        System.out.println("총점 : " + sum + " 평균 : " + avg);
    }
}
