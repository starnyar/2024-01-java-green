package com.green.quiz;
/*
길이가 같은 두 문자열 str1과 str2가 주어집니다.
두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 */
class SolutionCrossPrint {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for(int i = 0; i < str1.length()-1; i++) {
            stringBuilder.append(char1[i]).append(char2[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SolutionCrossPrint sol = new SolutionCrossPrint();
        String a = sol.solution("aaaaaaaa", "bbbbbbbb");
        System.out.println(a);
    }
}
