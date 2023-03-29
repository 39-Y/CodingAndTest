package org.example.more.StudyGroup.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class q1_BracketStack {
    public boolean isBracketPair(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(!dq.isEmpty() && dq.peek() != c)
                dq.pop();
            else
                dq.add(c);
        }
        return dq.isEmpty();
    }
}
