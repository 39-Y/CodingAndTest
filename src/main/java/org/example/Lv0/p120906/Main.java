package org.example.Lv0.p120906;

public class Main {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(new Solution().solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int answer = n;
        answer = (n+"").chars().map(num -> num-'0').sum();
        return answer;
    }
}