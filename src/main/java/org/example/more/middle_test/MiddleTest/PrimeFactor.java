package org.example.more.middle_test.MiddleTest;

public class PrimeFactor {
    public long max(long num) {
        long max = 0l;
        while(num%2==0){
            max=2;
            num/=2;
        }

        for(long i=3; i<=num; i+=2 ){
            if(num%i==0 && isPrime(i)){
                while(num%i == 0){
                    max=i;
                    num/=i;
                    System.out.println("i:"+i+"//num:"+num);
                }
            }
        }
        return max;
    }

    private boolean isPrime(long num){
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
