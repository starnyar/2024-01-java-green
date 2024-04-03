package com.green.day4;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        if(true && true && true){
            System.out.println("true && true && true");
        }
        boolean r = true && true && true;
        System.out.println("r : " + r);
        boolean r2 = true && true && true && false;
        System.out.println("r2 : " + r2);
    }
}
