package org.example.Lv3.Tower_Of_Hanoi;


import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

    }
}
class Solution{
    public List<int[]> answer;
    List<Stack<Integer>> towers = new ArrayList<>(){{
        add(null);
        add(new Stack<>());
        add(new Stack<>());
        add(new Stack<>());
    }};
    public int[][] solution(int n) {
        answer = new ArrayList<>();
        count(n);
        return  answer.stream().toArray(int[][]::new);
    }

    public void count(int n) {
        towers.set(1, new Stack<>(){{
            for(int i=1; i<=n; i++){
                add(i);
            }
        }});
        count(1,0,n);
    }

    private void count(int from, int to, int num) {
        if(num==0)
            return;
        if(num==1)
            to = 3;

        int disk = towers.get(from).pop();
        towers.get(to).add(disk);
        if(num == towers.get(3).peek())
            --num;
        answer.add(new int[] {from, to});
        count(to, from, num);
    }
}
