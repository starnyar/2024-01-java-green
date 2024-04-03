package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5); // ***** (개행)
        star.singlePrint(7); // ******* (개행)
        System.out.println("--------------------------");
        star.squarePrint(5);
        System.out.println("--------------------------");
        star.trianglePrint(4);
        //*
        //**
        //***
        //****
    }
}

class Star {
    Star() {

    }
    void singlePrint(int param) {
        for (int i = 0; i < param; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void squarePrint(int param) {
        for (int i = 0; i < param; i++) {
            singlePrint(param);
        }
    }

    void trianglePrint(int param) {
        for (int i = 1; i <= param; i++) {
            singlePrint(i);
        }
    }
}
