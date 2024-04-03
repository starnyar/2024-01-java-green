package com.green.day9.ch4;

public class FlowEx29 {
    /*
    1~100까지
    3, 6, 9 게임
    i = 1
    i = 2
    i = 3 짝
    i = 33 짝짝
     */
    public static void main(String[] args) {
        String result = "짝";
        int temp = 0;
        int number = 0;

        //나
        for (int i=1; i<=100; i++) {
            System.out.print("i = " + i + " ");
            temp = i;
            for (int j=1;j<=(int)(Math.log10(i)+1);j++) {
                number = temp%10;
                if (number % 3 == 0 && number != 0) {
                    System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
        }

        // 책
        for (int i=0; i<100; i++) {
            int n = i;

            System.out.print("i = " + i + " ");

            while(n != 0) {
                int m = n % 10;

                if (m % 3 == 0 && m != 0) {
                    System.out.print("짝");
                }

                n /= 10;
            }
            System.out.println();
        }

        //강사님
        for(int i=1; i<= 100; i++) {
            System.out.printf("i=%d", i);
            int copy = i;

            do {
                int oneDigit = copy % 10;
                if(oneDigit % 3 == 0 && oneDigit != 0) {
                    System.out.print("짝");
                }
            } while((copy /= 10) > 2);
            System.out.println();
        }
    }
}
