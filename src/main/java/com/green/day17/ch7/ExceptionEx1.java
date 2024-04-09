package com.green.day17.ch7;

public class ExceptionEx1 {
    public static void main(String[] args) {
        //선언은 밖에서

        try {
            int a = 20;
            int b = 20;
//            int c = 10 / 0;
            throw new Exception(); // 일부러 예외를 발생시키는 문장.
        } catch(ArithmeticException e) {
            System.out.println("수학적 예외 발생!!");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!!");
        } finally { //finally는 적어도 안적어도 상관 없음. 예외 발생 유무와 상관 없이 '무조건적으로 실행' 됨.
            System.out.println("finally는 반드시 실행한다.");
        }
        System.out.println("----종료----");
    }
}
