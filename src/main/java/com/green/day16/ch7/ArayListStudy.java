package com.green.day16.ch7;

import java.util.ArrayList;

public class ArayListStudy {
    public static void main(String[] args) {
        Object obj = 10;
        obj = "하하하하";
        obj = 11.1; // 다 담김.


        ArrayList list = new ArrayList();
        list.add(10); //0번방에 값이 대입.
        list.add(20); //1번방에 값이 대입.
        list.add(30); //2번방에 값이 대입.
        list.add("테스트"); //3번방에 String 대입.
        list.add(11.1);    // 4번방에 float 대입

//        list = list.get(0)    이런식으로 안씀;;
        int r = (int)list.get(0);
        r = (int)list.get(1);
        r = (int)list.get(2);
        System.out.println("---종료---");
    }
}
