package org.example.Lv2.H_Idex;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        //Integer[] citations = {7,7,7,7,6,5,5,5,3,2,1,0};
        //Integer[] citations = {9, 7, 6, 2};
        Integer[] citations = {4,4,4};
        Solution s = new Solution();
        System.out.println("----------s:"+s.solution(citations));

    }
}

class Solution {
    public int solution(Integer[] citations) {
        int[] counts = new int[citations.length];
        int answer = 0;
        Arrays.sort(citations, Collections.reverseOrder());

        for(int i=0; i<citations.length; i++){
            int count = 0;
            for(int n=0; n<citations.length; n++){
                if(citations[n]<citations[i])
                    break;
                ++count;
            }

            if(count >= citations[i]){
                answer= checkout(citations,counts,i);
                System.out.println("citations:"+citations[i]+"//count:"+count);
                break;
            }
            else if(i==citations.length-1){
                answer = count<citations[i]?count: citations[i];
            }
            counts[i] = count;
            System.out.println(Arrays.toString(counts));
        }
        return answer;
    }

    public int checkout(Integer[]citations, int[] counts, int idx){
        int result = citations[idx];
        if(idx!=0 &&
                citations[idx]<counts[idx-1]){
            result = counts[idx-1];
        }
        return result;
    }
}

