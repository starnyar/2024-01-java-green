package com.green.day16.ch7;

import java.util.Vector;

//        문제1
//        Product p = new Product(1000); // price = 1000, bonusPoint = 100
//        System.out.println(p);
//        Product p2 = new Product(500); // price = 500, bonusPoint = 50
//        System.out.println(p2);
public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println(tv); // Tv price: 100, bonusPoint : 10

        Computer pc = new Computer();
        System.out.println(pc);

        Sofa sofa = new Sofa();
        System.out.println(sofa);

        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        System.out.println(buyer);
    }
}
class Buyer {
    private int haveMoney;
    private int haveBonusPoint;
    Buyer (int haveMoney) {
        this.haveMoney = haveMoney;
    }

    public void buy(Product p) {
        this.haveMoney -= p.getPrice();
        this.haveBonusPoint += p.getBonusPoint();
    }

    public String toString() {
        return "haveMoney: " + this.haveMoney + " haveBonusPoint: " + this.haveBonusPoint;
    }
}

class Sofa extends Product {
    Sofa() {
        super(80);
    }
    public String toString() {
        return "Sofa " + super.toString();
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "PC " + super.toString();
    }
}

class Tv extends Product {
    Tv(){
        super(100);
    }

    @Override
    public String toString() {
        return "TV " + super.toString();
    }
}

class Product {
    private int price;
    private int bonusPoint;

//    public Product() {}

    public Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public int getPrice() {
        return this.price;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    @Override
    public String toString() {
        return "price: " + this.price + ", bonusPoint : " + this.bonusPoint;
    }
}
