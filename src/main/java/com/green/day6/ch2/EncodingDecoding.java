package com.green.day6.ch2;

import java.sql.SQLOutput;

public class EncodingDecoding {
    public static void main(String[] args) {
        char c = 'B';
        //int i = (int)c;
        int i = c; //자동형변환, 인코딩, 암호화
        
        char c2 = (char)i; //디코딩, 복호화

        System.out.printf("c: %C, i: %d\n", c, i);
    }
}
