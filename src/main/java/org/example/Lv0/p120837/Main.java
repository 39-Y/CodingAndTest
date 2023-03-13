package org.example.Lv0.p120837;

public class Main {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(new Solution().solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int ants = n/5;
        ants+= (n%5)/3;
        ants+= n%5%3;


        return ants;
    }
}