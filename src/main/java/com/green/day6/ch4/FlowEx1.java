package com.green.day6.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 1;
        //x=0 일 때, 참인 것은?(개행)
        System.out.printf("x = %d 일 때, 참인 것은?\n", x);

        String name = "가나";
        char bloodType = 'A';

        //"슬랙의 혈액형은 B형입니다."
        //"가나의 혈액형은 B형입니다."
        //"가나의 혈액형은 A형입니다."

        System.out.printf("%s의 혈액형은 %c형입니다.\n", name, bloodType);
    }
}
