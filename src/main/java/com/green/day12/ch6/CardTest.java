package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card.width = 110;

        System.out.println(Card.width);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        System.out.println("c1.kind : " + c1.kind + " c1.number : " + c1.number);
        System.out.println(c1.width); //스태틱변수 , 사용은 되나 지양 Card.width 식으로 사용
        System.out.println(c1.height); //스태틱변수 , 사용은 되나 지양 Card.width 식으로 사용

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        c1.width = 200;

        System.out.println("c2.kind : " + c2.kind + " c2.number : " + c2.number);
        System.out.println(c2.width); //스태틱변수 , 사용은 되나 지양 Card.width 식으로 사용
        System.out.println(c2.height); //스태틱변수 , 사용은 되나 지양 Card.width 식으로 사용
    }
}
