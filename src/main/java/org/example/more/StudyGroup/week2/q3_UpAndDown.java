package org.example.more.StudyGroup.week2;

public class q3_UpAndDown {
    public boolean isUpAndDown(int[]arr) {
        boolean isBigger = true;
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1])
                return false;
            else if(arr[i]<arr[i+1] != isBigger){
                isBigger = !isBigger;
                ++count;
            }
        }
        return count==1?true:false;
    }
}
