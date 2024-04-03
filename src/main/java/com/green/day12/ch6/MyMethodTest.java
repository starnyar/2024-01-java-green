package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10); // (콘솔출력) 짝수입니다.
        mm.checkOddEven(11); // (콘솔출력) 홀수입니다.
        mm.checkOddEven(100); // (콘솔출력) 짝수입니다.
        mm.checkOddEven(13); // (콘솔출력) 홀수입니다.

        int r = mm.abs(10);
        System.out.println(r); // 10

        r = mm.abs(-8);
        System.out.println(r); // 8

        int randomValue = mm.getRandomValue(10); // 0~9 사이의 랜덤값 리턴
        System.out.println(randomValue);
        randomValue = mm.getRandomValue(100); // 0~99 사이의 랜덤값 리턴
        System.out.println(randomValue);

        mm.printGugudan(3);
        /*
        3 x 1 = 3
        ..
        3 x 9 = 27
         */
        mm.printGugudan(5);

        int randomValue2 = mm.getRandomValue(10, 20); // 10 ~ 19 사이의 랜덤값 리턴
        randomValue2 = mm.getRandomValue(5, 31); // 5 ~ 30 사이의 랜덤값 리턴


        // 구구단 시작 단, 종료 단 보내주면 출력하는 메소드 작성
        System.out.println("구구단 시작 단, 종료 단 보내주면 출력하는 메소드 작성");
        mm.printGugudan(4,6);
    }
}

class MyMethod {
    void checkOddEven(int a) {
        System.out.println((a%2 == 0 ? "짝" : "홀") + "수입니다.");
    }

    int abs(int param) {
        return param >= 0 ? param : -param;
    }

    int getRandomValue(int param) {
        return (int)(Math.random()*param);
    }

    int getRandomValue(int param1, int param2) {
        return (int)(Math.random()*(param2-param1)) + param1;
    }

    void printGugudan(int param) {
        for(int i = 1; i <= 9; i++) {
            System.out.println(param + " x " + i + " = " + (param*i));
        }
    }

    void printGugudan(int param1, int param2) {
        for(; param1 <= param2; param1++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(param1 + " x " + i + " = " + (param1 * i));
            }
        }
    }
}