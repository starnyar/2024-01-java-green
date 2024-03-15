package com.green.day2;

public class Var2 {
    int gNum = 1;
    public static void main(String[] args){
        //변수 선언과 동시에 초기화
        int num = 10, num2 = 11, num3 = 0;
        Var2 var2 = new Var2();
        var2.test();
        int mulnum = var2.num_test(100,200);
        System.out.println(mulnum);
    }

    public void test(){
        System.out.println(gNum);
    }

    public int num_test(int tnum1, int tnum2){
        return tnum1 * tnum2;
    }
}
