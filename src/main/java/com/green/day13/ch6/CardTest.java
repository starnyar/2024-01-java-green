package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args) {
        // 카드객체 52개 만들어야함
        // shape = 클로버, 하트, 다이아몬드, 스페이드 4개
        // 숫자 = A,2,3,4,5,6,7,8,9,10,J,Q,K 13개

        Card[] cardPack = new Card[52];
        String[] cardShape = {"클로버", "하트", "다이아몬드", "스페이드"};
        String[] cardNumber = {"A","2","3","4","5","6","7","8","9","10","J","Q", "K"};

        makeCard(cardPack, cardShape, cardNumber);
        printCard(cardPack);
    }

    public static void makeCard(Card[] pack, String[] shape, String[] num) {
        int idx = 0;
        for(int i = 0; i < shape.length; i++) {
            for (int j = 0; j < num.length; j++) {
                pack[idx] = new Card();
                pack[idx].shape = shape[i];
                pack[idx].number = num[j];
                idx++;
            }
        }
    }

    public static void printCard(Card[] param) {
        for (int i = 0; i < param.length; i++) {
            System.out.print(param[i].shape + param[i].number + "\t");
            if (param[i].number.equals("K")) System.out.println();
        }
    }
}
