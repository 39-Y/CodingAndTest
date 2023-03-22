package org.example.more.StudyGroup.week2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class q1_SqrtSort {

    public int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num: arr){
            q.add((int)Math.pow(num,2));
        }
        for(int i=0; i<result.length; i++){
            result[i]=q.poll();
        }
        return result;
    }
}
