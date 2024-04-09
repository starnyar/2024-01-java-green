package com.green.day19.blackjack;

import java.util.List;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16; // 16이하면 카드 한 장 더 가져올거야

    Dealer () {
    }
    public boolean isMoreReceiveCard() {
        int point = 0;
        for (Card cd : cards) {
            point += cd.getPoint();
        }
        return point <= CAN_RECEIVE_POINT ? true : false;
    }
}

class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Spade", "A"));
        dealer.receiveCard(new Card("Spade", "K"));
        List<Card> cd = dealer.openCards();
        System.out.println(cd);
        boolean answer = dealer.isMoreReceiveCard();
        System.out.println(answer);
    }
}
