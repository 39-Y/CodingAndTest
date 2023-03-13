package org.example.more.StudyGroup.week1;

import java.util.Stack;

public class StringCount {
    public static String count(String s) {
        int count = 0;
        char pointer = ' ';
        String result = "";

        for(char c: s.toCharArray()){
            if(pointer == c)
                ++count;
            else{
                pointer = c;
                if(count > 0){
                    result+=count;
                    count=0;
                }
                result+=Character.toString(c);
            }
        }
        result+= count==0? "": count;
        return result;
    }
}
