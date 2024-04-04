package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10,11,12);
        System.out.println("hour : " + time.getHour());
        time.setHour(22);
        System.out.println("hour : " + time.getHour());
    }
}

class Time {    //캡슐화, 은닉화, 객체지향언어는 은닉화가 보편적임, 은닉화하지 않는 멤버필드 : 상수
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour   = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) { // setter 메소드명에 set은 소문자
                                    // setter는 void
                                    // 카멜케이스기법 setHour 소문자+변수명대문자시작
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() { // getter는 파라미터가 없음.
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

