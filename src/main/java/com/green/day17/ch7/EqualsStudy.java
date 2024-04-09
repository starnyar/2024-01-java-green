package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);
        System.out.println(n1 == n2); // false
        System.out.println(n1.equals(n2)); // true뜨게 해줘
    }
}

class Numbox {
    private int num;

    public Numbox(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Numbox)) {
            return false;
        }
        return this.num == ((Numbox)obj).num; // private를 걸어도 Numbox 안에 있기 때문에 getNum안해도 된다...
    }

//    public int getNum() {
//        return num;
//    }
}