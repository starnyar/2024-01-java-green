package com.green.day6.ch3;

public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = f;

        // double과 float을 비교할 때는 double을 float으로 형변환 해야 함.
        System.out.printf("%f == %f %b\n", 10.0, 10.0f, 10.0 == 10.0f);
        System.out.printf("%f == %f %b\n", f, d, f == d);
        System.out.printf("%f == %f %b\n", f, d, (double)f == d);
        System.out.printf("%f == %f %b\n", f, d, f == (float)d);
    }
}
