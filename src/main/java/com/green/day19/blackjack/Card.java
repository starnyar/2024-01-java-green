package com.green.day19.blackjack;

public class Card {
    private String pattern;     // 무늬, Spade, ..
    private String denomination; // A, 2~10, J, Q, K

    Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }

    @Override
    public String toString() {
        return this.pattern + "(" + this.denomination + ")";
    }

    public int getPoint() {
        int score = switch(this.denomination) {
            case "A"            -> 1;
            case "J", "Q", "K"  -> 10;
            default             -> Integer.parseInt(this.denomination);
        };
        return score;
    }
}

class CardTest {
    public static void main(String[] args) {
        Card c = new Card("Spade", "A");
        //기본생성자는 없어야 한다.

        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c); //Spade(A)

        int score = c.getPoint();
        System.out.println(score);
    }
}