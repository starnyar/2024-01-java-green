package com.green.quiz;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LowerUpperChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        for (char charArray : input.toCharArray()) {
            if (Character.isUpperCase(charArray)) {
                result += Character.toLowerCase(charArray);
            } else {
                result += Character.toUpperCase(charArray);
            }
        }
        System.out.println(result);
    }
}