package com.green.day9.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        /*
        score에서 가장 큰 값, 가장 작은 값 찾아내서 출력
        min : 33, max : 100
         */
        int scoreMax = score[0];
        int scoreMin = score[0];

        for (int i = 1; i < score.length; i++) {
            if (scoreMax < score[i]) {
                scoreMax = score[i];
            } else if (scoreMin > score[i]) {
                scoreMin = score[i];
            }
        }
        System.out.println("가장 큰 값 : " + scoreMax + " 가장 작은 값 : " + scoreMin);
    }
}
