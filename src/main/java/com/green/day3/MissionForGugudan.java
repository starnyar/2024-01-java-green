package com.green.day3;

public class MissionForGugudan {
    public static void main(String[] args) {
        MissionForGugudan mfg = new MissionForGugudan();
        mfg.oneGugudan();
        //mfg.allGugudan();
    }

    public void oneGugudan() {
        int dan = 0; //2~9 랜덤값
        int result = 0;
        dan = (int)(Math.random()*8.0)+2;
        System.out.println("-----" + dan + "단-----");
        for(int i=1;i<10;i++) {
            result = dan * i;
            System.out.println(dan + " x " + i + " = " + result);
        }
    }

    public void allGugudan() {
        for (int j=1;j<10;j++) {
            System.out.println("-----" + j + "단-----");
            for (int i = 1; i < 10; i++) {
                int result = j * i;
                System.out.println(j + " x " + i + " = " + result);
            }
        }
    }
}
