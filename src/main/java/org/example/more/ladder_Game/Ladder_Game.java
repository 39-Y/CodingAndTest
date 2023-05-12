package org.example.more.ladder_Game;

import java.util.HashMap;
import java.util.Map;

public class Ladder_Game {
    public char[] start(int n, int[][] ladder) {
        int term = ladder.length;
        char[] players = new char[n+1];
        for(int i=0; i<n; i++){
            players[i+1]=(char)('A'+i);
        }
        for(int i=0; i<term; i++){
            for(int l:ladder[i]){
                char tmp = players[l+1];
                players[l+1]=players[l];
                players[l]=tmp;
            }
        }
        return new String(players).substring(1).toCharArray();
    }
}
