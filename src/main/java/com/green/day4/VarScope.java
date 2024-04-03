package com.green.day4;

import java.util.Enumeration;

public class VarScope {
    public static void main(String[] args) {
        /*
        스코프 개념은 모든 언어가 동일
        변수가 선언이 되면 그 변수를 감싸고 있는 중괄호가 있다.
        그 중괄호를 벗어나면 변수가 죽는다.
         */
        int num = 20;
        if(1 > 0) {
            int num2 = 10;
            System.out.println(num2);
        }

        if(1 > 0) {
            int num2 = 10;
            System.out.println(num2); // 위 if문에 있는 num2와 같은 이름을 사용할 수 있다
                                        // 왜? 스코프(살아있는 범위)가 다르기 때문.
        }
        System.out.println("--------------");
        for(int i=0;i<10;i++) {

        }
        for(int i=0;i<10;i++) {
            /*int bb = 0; // 의미없는 코드 / 계속 초기화됨
            bb = bb + i; //의미없는 코드*/
        }
        //System.out.println(i); //for문에 선언 된 index는 for문 안에서만 살아있음.
    }
}
