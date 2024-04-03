package com.green.day11.ch6;

public class TvTest {
    // public 붙이면 com.green/ 아래 전부 사용가능
    // public 떼면(default라고 함) 패키지 안에서만 사용 가능 day11/ch6/...
    public static void main(String[] args) {
        Tv tv = new Tv(); // new가 들어가면 주소값이 다른 객체를 생성
        Tv tv1 = tv;
        tv.color = "red"; // . << 도트연산자 닷연산자 / 객체한테 일을 시키거나 속성값을 바꿀 때 사용하는 연산자. 접근하는 용도
        tv.channel = 10;
        tv.power = true;

        tv.power();

        System.out.println("tv color : " + tv.color + " channel : " + tv.channel + " power : " + tv.power);

        Tv tv2 = new Tv();
        tv2.channelUp();
        tv2.channelUp();
        System.out.println("tv == tv2 : " + (tv == tv2)); // reference type끼리 == 비교는 동일성 비교를 한다(주소값비교)


        System.out.println("tv2 color : " + tv2.color + " channel : " + tv2.channel + " power : " + tv2.power);
    }
}
