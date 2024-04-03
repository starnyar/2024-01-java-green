package com.green.day4;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        boolean r = true || true || true;
        System.out.println("r : " + r);
        boolean r2 = true  || true || false;
        System.out.println("r2 : " + r2);
        boolean r3 = false  || false || false;
        System.out.println("r3 : " + r3);
    }
}
