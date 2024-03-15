package com.green.day2;

public class RandomValue {
    public static void main(String[] args) {
        // 형변환, 타입이 안 맞으면 맞게 타입 변화를 줘야 한다.
        // 자동형변환, 강제형변환 2가지 존재

        /* 1에서 9 숫자 뽑기
        for(int i = 0;i < 10; i++){
            int result = (int)(Math.random() * 9) + 1;
            System.out.println(result);
        }*/

        // 5에서 12 숫자 뽑기
        for(int i = 1;i <= 100; i++) {
            int result = (int) (Math.random() * 8) + 5;
            if(result == 5) {
                System.out.println(i + "번 돌려서 " + result + "가 나왔습니다.");
                break;
            }
        }
    }
}
