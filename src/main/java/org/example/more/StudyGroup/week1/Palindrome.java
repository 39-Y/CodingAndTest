package org.example.more.StudyGroup.week1;

public class Palindrome {

    public String isPalidrome(String word) {
        String upper_word = word.toUpperCase();
        System.out.println(upper_word);
        String reverse = new StringBuffer(upper_word).reverse().toString();
        return upper_word.equals(reverse)? "YES":"NO";
    }
}
