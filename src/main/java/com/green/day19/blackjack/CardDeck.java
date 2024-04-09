package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Clover"};
    public static final int CARD_COUNT = 13;
    private List<Card> list;

    CardDeck() {
        list = new ArrayList<>();
        //카드덱 생성
        for(String pattern : this.PATTERNS) {
            for(int i = 1; i <= this.CARD_COUNT; i++) {
                this.list.add(new Card(pattern, getDenomination(i)));
            }
        }
    }

    public String getDenomination(int i) {
        return switch(i) {
                    case 1  -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> ""+i;
                };
    }

    public void printCards() {
//        System.out.println(list);
        for(Card c : this.list) {
            if (c.getDenomination() == "K") {
                System.out.println(c);
            } else {
                System.out.print(c + "\t");
            }
        }
    }

    public Card draw() {
        int ran = (int)(Math.random()*list.size()); // 한장 뽑으면 52>51로 줄어드니 list.size로 써야함...
        return this.list.remove(ran);
    }

    public List getList() {
        return this.list;
    }
}

class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        // 기본 생성자에서 PATTERNS, CARD_COUNT를 활용하여
        // 52장의 카드 객체를 생성하여 LIST에 추가해 주세요.
        // cd.printCards();

        Card c = cd.draw(); // 랜덤한 카드 객체 주소값 리턴
        // 메소드에 static이 붙으면 객체의 인스턴스 매개변수에 접근할 수 없음.
        System.out.println(c);
        cd.printCards();
    }
}
