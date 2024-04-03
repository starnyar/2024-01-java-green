package com.green.day7.ch4;

public class FlowEx10 {
    /*
    * switch 사용
    * 90점 이상은 "당신의 학점은 A 입니다.
    * 80점 이상은 "당신의 학점은 B 입니다.
    * 70점 이상은 "당신의 학점은 C 입니다.
    * 60점 이상은 "당신의 학점은 D 입니다.
    * 10의 자리 숫자를 뽑아내서 switch 로 해결
    */
    public static void main(String[] args) {
        int random = (int)(Math.random() * 51) + 50;
        if(!FlowEx4.scoreExceptionInt(random)) { return; }
        int tenRandom = random / 10;
        String grade = switch(tenRandom) {
            case 10, 9  -> "A";
            case 8      -> "B";
            case 7      -> "C";
            case 6      -> "D";
            default     -> "F";
        };
        System.out.println(random + " 당신의 학점은 " + grade + "입니다.");
    }
}
