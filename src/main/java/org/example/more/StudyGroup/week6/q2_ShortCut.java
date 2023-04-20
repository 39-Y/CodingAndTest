package org.example.more.StudyGroup.week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q2_ShortCut {
    int[][] maze = new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0},
        {1, 0, 1, 1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1, 0, 0, 0},
        {1, 1, 1, 0, 1, 0, 1, 1},
        {1, 1, 1, 0, 1, 0, 0, 0},
        {1, 1, 0, 0, 0, 1, 0, 0},
        {1, 1, 0, 1, 0, 0, 0, 0}
    };
    public int find() {
        return find(1,1,0);
    }

    private int find(int x, int y, int depth) {
        if(x>7 || y>7 || maze[y][x] != 0)
            return -1;
        if(x==7 && y==7)
            return depth;

        maze[y][x] = 2;
        int[] route = new int[4];
        route[0] = find(x-1,y,depth+1);
        route[1] = find(x+1,y,depth+1);
        route[2] = find(x, y-1, depth+1);
        route[3] = find(x, y+1, depth+1);

        int result = -1;
        Arrays.sort(route);
        for(int n: route){
            if(n>0){
                result = n;
                break;
            }

        }
        maze[y][x]= 0;
        return result;
    }
}
