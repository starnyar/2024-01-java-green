package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card cd) {
        cards.add(cd);
    }

    public List<Card> openCards() {
        return cards;
    }
}

class GamerTest {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        Card c = new Card("Spade", "9");
        gamer.receiveCard(c);
        gamer.receiveCard(new Card("Heart", "2"));
        List<Card> cards = gamer.openCards();
        System.out.println(cards);
    }
}
