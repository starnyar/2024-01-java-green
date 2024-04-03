package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 128;
        int i2 = -129;

        int n3 = 100; // n3을 byte로 형변환을 할 것이다.
                    // 형변환 할 수 있는 값인지 체크하는 if문 작성.

        if(Byte.MAX_VALUE >= n3 && Byte.MIN_VALUE <= n3) {
            System.out.println("n3의 값은 -128 ~ 127 사이의 값이므로 형변환 가능합니다.");
        } else {
            System.out.println("n3의 값은 -128 ~ 127 사이의 값이 아니므로 형변환이 불가능합니다.");
        }

        //언더플로우
        if(Byte.MIN_VALUE <= i2) {
            byte b2 = 0;
            b2 = (byte)i2;
            System.out.println("b2 : " + b2);
        }

        //오버플로우
        if(Byte.MAX_VALUE >= i) {
            byte b = 0; //-128~127
            b = (byte) i;
            System.out.println("b: " + b);
        }
        System.out.println("--종료--");
    }
}
