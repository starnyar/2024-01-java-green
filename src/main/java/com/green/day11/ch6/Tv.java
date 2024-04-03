package com.green.day11.ch6;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
        //channel += 1;
    }

    void channelDown() {
        channel--;
    }
}
