package org.example.more.middle_test.MiddleTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class LeastCommonMultiple {
    public long find(int limit) {
        int[] nums = Stream.iterate(2, i-> i+1).limit(limit-1).mapToInt(Integer::intValue).toArray();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            if(!isPrime(num))
                for(int n: list){
                    num/= num%n==0 ? n : 1;
                }
            if(num !=1)
                list.add(num);
        }
        long total = 1;
        for(int n: list){
            total*=n;
        }
        System.out.println(list);
        return total;
//        return list.stream().reduce(1,(a,b) -> a*b);
    }

    private boolean isPrime(int num) {
        if(num<4)
            return true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }


}
