package com.green.day12.ch6;
//p.247
// private . 클래스내부에서만 사용 가능. 캡슐화
// default . 아무 것도 안붙인 것. 잘안씀. 클래스 내부에서도 사용 가능하지만 같은 패키지 안에서 접근이 가능하다.com.green.day12.ch6;랑 100% 동일한 패키지여야 함 상위x하위x
// protected . 위 두개 포함. 클래스에서도 되고 패키지에서도 되고 패키지에서 쓸려면 상속화 해야함. 잘안씀.
// public 모든 패키지에서 사용 가능. 자주 씀
public class Card {
    String kind; //무늬, String kind = "ddd" < 명시적 초기화
    int number; //숫자
    
    static int width = 100; //가로
    static int height = 250; //세로
}