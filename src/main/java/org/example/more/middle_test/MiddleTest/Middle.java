package org.example.more.middle_test.MiddleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Middle {

    public void t21(){
        Long total = 0L;
       for(int i=1; i<100000; i++){
           if(i%3==0 || i%5==0){
               total+=i;
           }
       }
    }

    public long t23(){
        int sum = 0;
        List<Long> nums = new ArrayList<>();
        nums.add(1l);
        nums.add(2l);

        while(true){
            int currentIdx = nums.size()-1;
            int preIdx = nums.size()-2;
            long value = nums.get(currentIdx)+nums.get(preIdx);
            if(value > 50000000)
                break;
            nums.add(value);
        }

        for(long num: nums ){
            sum+=num;
        }
        return sum;
    }

    public long t25(){
        long para = 1600851475143l;
        long num = (long)Math.sqrt(para);
        long result =0;
        for(int i=1; i<=num; i+=2){
            if(para%i==0){
                result = i;
            }
        }
        return result;
    }

    public void t29(){
        int para = 24;
        long result =1;
        int[] arr = new int[para];
        List<Integer> multi = new ArrayList();
        for(int i=0; i<para; i++ ){
            arr[i] = i;
        }
        for(int i=1; i<para-1; i++){
            boolean change = false;
            for(int n=i+1; n<para; n++){
                if(arr[i] !=1 && arr[n] % arr[i]==0){
                    arr[n] /= arr[i];
                    change = true;
                }
            }
            if(change){
                multi.add(arr[i]);
                arr[i]=1;
            }
        }


        for(int m: multi){
            result*=m;
        }
        for(int i=1; i<arr.length; i++){
            result*=arr[i];
        }
        System.out.println(result);
    }
    public void t27(){
        long para = 1600851475143l;
        long num = (long)Math.sqrt(para);
        long result =0;
        for(long i=num; i>1; i-=2){
            boolean a = false;
            if(para%i==0){
                System.out.println(i);
                for(int n=2; n<Math.sqrt(i); n++ ){
                    if(i%n==0){
                        System.out.println("no:"+i);break;
                    }

                }
            }
        }
    }
}
