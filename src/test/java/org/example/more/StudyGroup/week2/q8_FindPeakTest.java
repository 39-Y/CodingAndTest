package org.example.more.StudyGroup.week2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class q8_FindPeakTest {
    /*
     * 0 0 0 0
     * 0 5 3 0
     * 0 3 7 0
     * 0 0 0 0
     * */
    int[][] area4_4 = {{0,0,0,0}, {0,5,3,0}, {0,3,7,0}, {0, 0, 0, 0}};
    /*
    * 5 3 7 2 3
    * 3 7 1 6 1
    * 7 2 5 3 4
    * 4 3 6 4 1
    * 8 7 3 5 2
    * */
    int[][] area7_7 = {{0,0,0,0,0,0,0}, {0,5,3,7,2,3,0}, {0,3,7,1,6,1,0},
            {0,7,2,5,3,4,0}, {0,4,3,6,4,1,0}, {0,8,7,3,5,2,0}, {0,0,0,0,0,0,0}};
    @Test
    @DisplayName("4*4 배열로 isPlain으로 평지인지 확인")
    void t1(){
        q8_FindPeak q8 = new q8_FindPeak(area4_4);
        for(int i=0; i<4; i++){
            for (int n=0; n<4; n++){
                if(q8.isPlain(i, n)<0)
                System.out.println(String.format("(%d,%d)는평지인가? %d",i,n,q8.isPlain(i, n)));
            }
        }
    }

    @Test
    @DisplayName("4*4 배열 봉우리 개수? 2개")
    void t2(){
        q8_FindPeak q8 = new q8_FindPeak(area4_4);
        Assertions.assertThat(q8.count(1,1)).isEqualTo(2);
    }

    @Test
    @DisplayName("7*7 배열 봉우리 개수? 10개")
    void t3(){
        q8_FindPeak q8 = new q8_FindPeak(area7_7);
        Assertions.assertThat(q8.count(1,1)).isEqualTo(10);
    }
}