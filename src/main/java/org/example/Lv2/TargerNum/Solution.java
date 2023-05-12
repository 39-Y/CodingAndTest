package org.example.Lv2.TargerNum;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    Integer[] nums;
    int count = 0;

    public int solution(int[] numbers, int target){
        int diff = Arrays.stream(numbers).sum()-target;
        nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());

        for(int i=0;i<nums.length; i++){
            dfs(i,diff/2,0);
        }
        return count;
    }
    private void dfs(int idx,int remain, int deep){
        if(idx > nums.length-1)
            return;
        if(remain<nums[idx])
            return;
        else if(remain == nums[idx]){
            ++count;
            return;
        }
        for(int i=idx+1; i<nums.length; i++){
            dfs(i, remain-nums[idx], deep+1);
        }

    }
}
