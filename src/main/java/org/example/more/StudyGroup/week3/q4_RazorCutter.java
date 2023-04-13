package org.example.more.StudyGroup.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class q4_RazorCutter {
    // ()(((()())(())()))(())
    public int cut(String place) {
        int ironBar = 0;
        int fragment = 0;
        Deque<Character> dq = new ArrayDeque();
        for(char c: place.toCharArray()){
            if(c==')' && dq.peekLast() == '('){ //레이져
                dq.removeLast();
                dq.removeLast();
                fragment+=ironBar;
            }
            else if(c=='('){  //쇠막대 시작점
                dq.add(c);
                ++ironBar;
            }
            else{ //쇠막대 끝점
                ironBar--;
            }
        }
        return 0;
    }

}
