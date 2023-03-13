package org.example.more.middle_test.MiddleTest;

//5000만 이하의 짝수항 합
public class Fibonacci {


    public long evenSum(int limit) {
        long pre = 1;
        long post = 2;
        long sum= 2;
        while(pre+post <= limit){
            long temp = post;
            post += pre;
            pre = temp;
            sum += post%2==0? post: 0;
        }
        return sum;
    }
}
