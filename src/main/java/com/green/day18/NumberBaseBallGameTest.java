package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(4);
        game.start();
    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 4;
    static final int MAX_NUMBER = 9;
    final int NUMBER_COUNT;
    private int[] numArr;

    NumberBaseBallGame(final int NUMBER_COUNT) {
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }

    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        Main:
        for(int i=0; i<this.numArr.length; i++) {
            int rVal = getRandomValue();
            for(int z=0; z<i; z++) {
                if(this.numArr[z] == rVal) {
                    i--;
                    continue Main;
                }
            }
            this.numArr[i] = rVal;
        }

    }

    private int getRandomValue() {
        return (int)(Math.random() * MAX_NUMBER) + MIN_NUMBER;
    }

    void start() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자를 %d개 입력해주세요. (구분은 스페이스) >>> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine();
            String[] answerStrArr = strAnswer.split(" ");
            int[] answerArr = new int[answerStrArr.length];
            int idx = 0;
            for (String a : answerStrArr) {
                answerArr[idx] = Integer.parseInt(a);
                idx++;
            }

            if(numArr.length != answerArr.length) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            int striker = 0, ball = 0;
            //striker, ball 찾아내면 된다!!!

            for(int i = 0; i < NUMBER_COUNT; i++) {
                for(int j = 0; j < NUMBER_COUNT; j++) {
                    if (numArr[i] == answerArr[j] && i == j) {
                        striker++;
                        break;
                    } else if (numArr[i] == answerArr[j] && i != j) {
                        ball++;
                        break;
                    }
                }
            }

            if (striker == NUMBER_COUNT) {
                System.out.println("정답!!");
                break;
            }

            System.out.println("S : " + striker + " B : " + ball + " O : " + (NUMBER_COUNT - (striker+ball)));
        }
        scan.close();
    }

    public void showArr() {
        System.out.println(Arrays.toString(this.numArr));
    }
}
