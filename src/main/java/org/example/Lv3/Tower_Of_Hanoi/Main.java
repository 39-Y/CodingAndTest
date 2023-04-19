package org.example.Lv3.Tower_Of_Hanoi;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

    }
}
class Solution{
    public int[][] answer;
    public int[][] solution(int n) {
        answer = new int[(int)Math.pow(2, n)-1][2];
        return count(n);
    }

    public int[][] count(int n) {
        if(n==1)
            return new int[][]{{1,3}};
        else
            return null;
    }
}
