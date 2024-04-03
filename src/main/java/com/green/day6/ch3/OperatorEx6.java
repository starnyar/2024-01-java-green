package com.green.day6.ch3;
// p.98 ~ 100
public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); // byte + byte는 int로 연산이 되기 때문에 byte로 형변환 해야한다.
        System.out.println(c);

        int d = 1_000_000; // 언더바 사용 가능
        System.out.println(d);

        long e = 1_000_000 * 1_000_000;
        long f = 1_000_000 * 1_000_000L;

        System.out.println("e : " + e);
        System.out.println("f : " + f);

        double g = 10 / 3;
        double h = 10 / 3.0;

        System.out.println("g : " + g);
        System.out.println("h : " + h);
    }
}
