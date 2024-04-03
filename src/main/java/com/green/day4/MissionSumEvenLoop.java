package com.green.day4;

public class MissionSumEvenLoop {
    public static void main(String[] args) {
        //1~100까지 짝수만 더한 값 출력

        int sum = 0;
        for(int i=1;i<101;i++){
            if(i % 2 == 0){sum+=i;}
        }
        System.out.print(sum);
    }
}
