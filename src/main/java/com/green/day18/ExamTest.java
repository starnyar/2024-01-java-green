package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 101);
        int rVal2 = Exam.getRandomValue(1, 101);
        Exam.printOddEven(rVal); // ?는(은) 짝/홀수입니다.

        //100, 99, 98, 97
        for (int i = 100; i<104 ; i++){
            System.out.println(200-i);
        }

        System.out.println("--------------------");
        Exam.test(rVal, rVal2);
        System.out.println("--------------------");
        // n1 ~ n2 숫자를 세로로 출력
//        Exam.printNumToNum(4, 22); // 앞숫자 ~ 뒤숫자 세로로 출력

        int score = Exam.getRandomValue(-100, 200);
        String grade = Exam.getGrade(score);
        System.out.println("score : " + score + " grade : " + grade);
        // score 값이 0~100 사이의 값이 아니면 "점수가 잘못되었습니다 리턴"
        System.out.println("--------------------");
        int sum = Exam.getSumFromTo(8,20); // 8 ~ 20까지 모두 더한 값을 리턴
        System.out.println(sum);
    }
}

class Exam {
    Exam() {}

    public static int getSumFromTo(int param1, int param2) {
        int result = 0;

        for(;param1<=param2;param1++) {
            result += param1;
        }
        return result;
    }

    public static String getGrade(int score) {
        String grade;

        if (score > 100 || score < 0) {
            return "점수가 잘못되었습니다.";
        }
        if (score < 70) {
            return "F";
        }
        if (score == 100) {
            return "A+";
        }
        grade = switch (score / 10) {
            case 9  -> "A";
            case 8  -> "B";
            default -> "C";
        };
        grade += switch (score % 10) {
            case 0, 1, 2 -> "-";
            case 7, 8, 9 -> "+";
            default      -> "0";
        };
        return grade;
    }

    public static void printNumToNum(int param1, int param2) {
        for (;param1<=param2;param1++) {
            System.out.println(param1);
        }
    }

    public static void test(int rVal1, int rVal2) {
        //val1이 짝수면 (val2도 짝수면 val2 - val1 값을 출력, 홀수면 val1 값을 출력)
        // val1이 짝수고, val2가 짝수면 val2 - val1 값을 출력
        // val1이 짝수고 val2가 홀수면 val1 값을 출력

        //val1이 홀수면 (val2가 짝수면 val2 - 5 값을 출력, 홀수면 VAL2값 출력)
        //val1이 홀수고, val2가 짝수면 val2 - 5 값을 출력
        //val2가 홀수면 VAL2값 출력
        int result = rVal1 % 2 == 0 ? rVal2 % 2 == 0 ? rVal2 - rVal1 : rVal1
                                    : rVal2 % 2 == 0 ? rVal2 - 5     : rVal2;

        System.out.println("rVal1 : " + rVal1 + " rVal2 : " + rVal2 + " result : " + result);
    }

    public static int getRandomValue(int rVal1, int rVal2) {
        return (int)(Math.random()*(rVal2-rVal1) + rVal1);
    }

    public static void printOddEven(int rVal) {
        System.out.println(rVal + "는(은) " + (rVal % 2 == 0 ? "짝" : "홀") + "수입니다.");
    }
}
