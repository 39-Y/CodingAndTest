package org.example.Lv2.joyStick;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    int count = 0;
    char[] newNameArr;


    public int solution(String newName) {
        newNameArr = newName.toCharArray();
        int length = newName.length();
        char[] name = new char[length];
        Arrays.fill(name,'A');
        int idx = 0;
        //한번에 문자 변환 카운트
        for(char letter:newNameArr){
            if(letter != 'A'){
                //count+=countToChange(letter);
            }
        }
        //coun+=countToMove();
        return count;
    }

    private int[] nextMove(int idx){
        int times = newNameArr.length;
        Deque<Character> letters = new ArrayDeque();
        for(char letter:newNameArr){
            letters.add(letter);
        }
        for(int i=idx; i>=0; i-- ){
            letters.add(letters.pop());
        }
        for(int t=1; t<times; t++){
            char letter = letters.pop();
            if(letter!='A')
                return new int[]{t, (idx+t)%times};
        }
        return new int[]{0,0};
    }

    private int[] reverseMove(int idx){
        int times = newNameArr.length;
        Deque<Character> letters = new ArrayDeque();
        for(char letter:newNameArr){
            letters.add(letter);
        }
        for(int i=idx; i>0; i-- ){
            letters.add(letters.pop());
        }
        for(int t=1; t<times; t++){
            char letter = letters.removeLast();
            if(letter!='A'){
                int newIdx = idx-t<0? idx-t+times: idx-t;
                return new int[]{t, newIdx};

            }
        }
        return new int[]{0,0};
    }


    private int countToMove(int idx) {
        Deque<Character> letters = new ArrayDeque();
        for(char letter:newNameArr){
            letters.add(letter);
        }
        return Math.min(countToMove(letters,1,1), countToMove(letters,-1,1));
    }

    private int countToMove(Deque letters, int next, int depth) {
        if(depth == newNameArr.length-1)
            return newNameArr.length-1;

        return -0;
    }
}
