package com.green.day16.ch7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 10; // int primitive type의 객체형이 Integer
        System.out.println(n1 == n2); // true
        double d1 = 10.1;
        Double d2 = 10.1;
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new LinkedList();


        list.remove(0);
//        list.add("우우우");
        int r1 = list.get(0);
        int r2 = list.get(1);

        System.out.println(list);

        for (int i = 0; i<list.size(); i++) {
            System.out.println("list.get(" + i + ") >> " + list.get(i));
        }

    }
}
