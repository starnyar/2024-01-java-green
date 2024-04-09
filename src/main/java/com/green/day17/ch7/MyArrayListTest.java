package com.green.day17.ch7;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10); //arr기존 크기보다 1칸 더 큰 새로운 배열 만들고 그 배열의 0번 칸에 10을 집어 넣는다.
                      // 새로운 배열의 주소값을 전역변수 arr에 대입한다.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println(list);
        int size = list.size(); // 3
        System.out.println("size : " + size);
        System.out.println(list.get(3)); // 40
        System.out.println(list.get(0)); // 10
    }
}

class MyArrayList {
    // int 배열의 주소값을 담을 수 있는 친구
    private int[] arr;

    MyArrayList() {
        this.arr = new int[0];
    }

    public int get(int param) {
        return this.arr[param];
    }

    public int size() {
        return this.arr.length;
    }

    void add(int param) {
        if (this.arr.length > 0) {
            int[] tmp = new int[(this.arr.length)+1];
            int idx = 0;

            for (int i : this.arr) {
                tmp[idx] = i;
                idx++;
            }
            tmp[tmp.length-1] = param;
            this.arr = tmp;
        } else {
            this.arr = new int[1];
            this.arr[0] = param;
        }
    }

    public String toString() {
        if (this.arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("" + arr[0]);

        for(int i = 1; i < this.arr.length; i++) {
            sb.append(", " + this.arr[i]);
        }

        return "[" + sb + "]";
    }
}