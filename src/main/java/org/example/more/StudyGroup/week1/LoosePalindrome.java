package org.example.more.StudyGroup.week1;

public class LoosePalindrome {

    public String isPalindrome(String string) {
        int size = string.length();
        int mismatchCount = 0;

        int i=0;
        int n= size-1;
        while(true){
            if(i>=n || mismatchCount>2)
                break;
            if(!isSame(i, n, string)) {
                ++mismatchCount;
                if(isSame(i+1, n, string))
                    ++i;
                else if(isSame(i, n-1, string))
                    --n;
            }
            ++i;
            --n;
        }
        return mismatchCount>1?"NO":"YES";
    }

    private boolean isSame(int i, int n, String s){
        return s.charAt(i) == s.charAt(n);
    }
}
