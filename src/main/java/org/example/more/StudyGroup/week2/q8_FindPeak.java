package org.example.more.StudyGroup.week2;

public class q8_FindPeak {
    int[][] area;
    int[][] checkArr;
    int size;
    int result;
    public q8_FindPeak(int[][] area){
        this.area=area;
        size = area.length;
        checkArr = new int[size][size];
        result=0;
    }

    public boolean isMax(int x, int y){
        int point = area[x][y];
        if(point > area[x-1][y] &&
           point > area[x+1][y] &&
           point > area[x][y-1] &&
           point > area[x][y+1]){
            return true;
        }
            return false;
    }

    public int count(int x, int y){
        if(x<0 || y<0 || x>=size || y>=size) // area를 벗어났는가?
            return result;

        int value = checkArr[x][y];
        checkArr[x][y] = value==0? isPlain(x,y): value; //확인되지 않은 땅이면 평지인지 체크

        if(checkArr[x][y] == 0){//Peak이 될 수 있나?
            if(isMax(x,y)){
                ++result;
                checkArr[x-1][y] = -1;
                checkArr[x+1][y] = -1;
                checkArr[x][y-1] = -1;
                checkArr[x][y+1] = -1;
                checkArr[x][y] = 1;
            }
        }
        count(x+1, y);
        count(x,y+1);

        return result;
    }
    public int isPlain(int idx_x, int idx_y){
        return idx_x*idx_y==0 || idx_x == size-1 || idx_y == size-1? -1: 0;
    }
}
