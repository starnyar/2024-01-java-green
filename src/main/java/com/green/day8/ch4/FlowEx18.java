package com.green.day8.ch4;

public class FlowEx18 {
    /*
    2~9 구구단 출력
    2 x 1 = 2..
    ---
    3 x 1 = 3...
     */
    public static void main(String[] args) {
        for (int i=2;i<10;i++){
            if(i>2)System.out.println("------"); // 맨 뒤에 - --- 나오는거 없앰
            for (int j=2;j<10;j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
