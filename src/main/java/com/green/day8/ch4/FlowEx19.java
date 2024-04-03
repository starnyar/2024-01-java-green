package com.green.day8.ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        /*
        반복문을 활용하여 이렇게 출력해 주세요.
        111
        112
        113
        121
        122
        123
        131
        132
        133
        211
        ...
        333
        */

        final int LAST_NUM = 3;
        for(int i1=1; i1<=LAST_NUM; i1++) {
            for (int i2 = 1; i2 <= LAST_NUM; i2++) {
                for (int i3 = 1; i3 <= LAST_NUM; i3++) {
                    System.out.println(""+i1+i2+i3);
                }
            }
        }

//        int i = 1;
//        int j = 1;
//        int l = 1;
//
//        while(true) {
//            System.out.println(""+i+j+l);
//            l++;
//            if (l >= 4) {
//                j++;
//                l = 1;
//            }
//            if (j >= 4) {
//                i++;
//                j = 1;
//            }
//            if(i>=4) {
//                break;
//            }
//        }
    }
}
