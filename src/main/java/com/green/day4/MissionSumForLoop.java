package com.green.day4;

public class MissionSumForLoop {
    public static void main(String[] args) {
        //1~10까지 더한 값 출력

        int result = 0;
        for(int j=1;j<11;j++) {
            result+=j;
        }
        System.out.print(result);
    }
}
