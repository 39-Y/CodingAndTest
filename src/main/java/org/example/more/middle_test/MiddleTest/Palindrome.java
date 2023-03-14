package org.example.more.middle_test.MiddleTest;

import java.util.Collections;

public class Palindrome {

    public long maxPalindrome(int place) {
        String num = "";
        for(int i=0; i<place; i++){
            num+="9";
        }

        long MAX = Long.parseLong(num);
        long maxResult = -1;
        for(long i=MAX; i>=(MAX+1)/10; i--){
            for (long n=i; n>=(MAX+1)/10; n--){
                if(isDecal(n*i)){
                    maxResult=Math.max(maxResult, n*i);
                }
            }
        }
        return maxResult;
    }

    private boolean isDecal(long l) {
        String s1 = l+"";
        String s2 = new StringBuffer(s1).reverse().toString();
        return s1.equals(s2);
    }
}
