package com.green.day6.ch3;

public class OperatorEx1 {
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;

        int r1 = (-n1) - n2; // -n1-n2 랑 값은 같으나 가독성을 위해 ()삽입
        System.out.println("r1 : " + r1);

        int r2 = n1 + n2 * n1 / n2;
        System.out.println("r2 : " + r2);
        int r3 = n1 +((n2 * n1) / n2);
        System.out.println("r3 : " + r3);

        System.out.println("-------------");

        //증감 연산자
        int i = 5, j = 0;
        i++;
        System.out.println("i : " + i);

        i = 5;
        ++i;
        System.out.println("i : " + i);

        i = 5;
        j = i++; // Read(i), Write(++) 순서로 진행함. 1. j = i  2. i += 1
        System.out.printf("i : %d, j : %d\n", i, j);

        i = 5;
        j = ++i; // Write(++), Read(i) 순서로 진행함. 1. i += 1  2. j = i
        System.out.printf("i : %d, j : %d\n", i, j);

        System.out.println("-----------");

        int k = 10;
        System.out.println(k++);
        System.out.println(++k);
        System.out.println(++k);
        System.out.println(k++);
        System.out.println(k);
    }
}
