package com.green.day9.ch4;

public class FlowEx30 {
    /*
    1 ~ n 까지 더하는데 100이 막 넘은 index 값과 sum 값을 출력한다.
    i : 14, sum : 105
    while 문으로 해결
     */
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(sum <= 100) {
            System.out.println("sum += i++ : " + sum + " += " + i + "++");
            sum += i++;
            System.out.println("i++ 이후 : " + i);
        }
        System.out.println("i : " + i + " sum : " + sum);
    }
}
