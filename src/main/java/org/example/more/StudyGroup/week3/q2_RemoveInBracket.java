package org.example.more.StudyGroup.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class q2_RemoveInBracket {
    public String remove(String s) {
        Deque<Character> dq = new ArrayDeque();
        for(char c: s.toCharArray()){
            if(!dq.isEmpty() && c==')'){
                while(true){
                    if(dq.isEmpty() || dq.removeLast()=='(')
                        break;
                }
            }
            else
                dq.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append(dq.pop());
        }
        return sb.toString();
    }
}
