package org.example.more.StudyGroup.week2;

import java.util.Stack;

public class q4_Biggest_Up_Down {
    int max = -1;
    public int maxCount(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int count = 0;
            Stack<Boolean> st = new Stack();
            st.add(true);
            if(arr[i] >= arr[i+1])
                continue;
            for(int n=i; n<arr.length-1; n++){
                if(arr[n]==arr[n+1])
                    break;
                else if(arr[n]<arr[n+1] != st.peek()){
                    st.add(!st.peek());
                    if(st.size()>2)
                        break;
                }
                count = n+2-i;
                max = max<count? count: max;
            }
        }
        return max=max<3? 0 : max;
    }
}
