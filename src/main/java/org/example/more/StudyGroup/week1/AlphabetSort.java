package org.example.more.StudyGroup.week1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlphabetSort {

    public String sort(String string) {
        String reversedStr = new StringBuilder(string)
                .reverse()
                .toString()
                .chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(""));

        char[] str = string.toCharArray();
        int idx =  0;
            for(int i=0; i<string.length(); i++){
                if(Character.isLetter(str[i])){
                    str[i]=reversedStr.charAt(idx++);
                }
            }
        return String.valueOf(str);
    }
}
