package com.green.quiz;
/*
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
arr	            result
["a","b","c"]	"abc"
 */
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        Solution sol = new Solution();
        System.out.println(sol.solution(arr));
    }
}