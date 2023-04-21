package org.example.Lv2.joyStick;

import java.util.Arrays;

public class Solution {
    int count = 0;
    String newName;

    public int solution(String newName) {
        this.newName = newName;
        int length = newName.length();
        char[] name = new char[length];
        Arrays.fill(name,'A');
        int idx = 0;

        while(true){
            //name과 newName이 같아지면 반복 종료
            if(new String(name).equals(newName))
                break;

            //이니셜이 A가 아니면 글자를 바꾸고 조작 횟수 카운트
            char initial =  newName.charAt(idx);
            if(initial != 'A'){
                name[idx] = initial;
                countToChange(initial);
            }
            //다음 A가 아닌 곳까지 이동 후, 조작 횟수 카운트
            idx = countToNext(idx);

        }
        return count;
    }
    private int nextIdxOf(int idx){ // idx 이후 A가 아닌 idx 찾기
        int nextIdx =idx;
        for(int i=idx+1; i<newName.length(); i++){
            if (newName.charAt(i)!='A'){
                return nextIdx = i;
            }
        }
        return nextIdx;
    }

    private int countToNext(int idx) {
        int nextIdx = nextIdxOf(idx);
        int distance = nextIdx-idx; //idx -> nextIdx 앞으로 갔을 때
        int reverseDistance = idx + newName.length() - nextIdx; //idx -> nextIdx 뒤로 갔을 때
        int min = Math.min(distance, reverseDistance);//최소값
        count+=min;
        return nextIdx;
    }

    private int countToChange(char initial) {
        int gap = initial-'A';
        int move = gap<14 ? gap : 'Z'-initial+1;
        count+=move;
        return move;
    }
}
