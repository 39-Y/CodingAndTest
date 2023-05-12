package org.example.more.ladder_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ladder_GameTest {
    int n;
    int[][] ladder;
    @Test
    @DisplayName("n:5, ladder: [[1,3],[2,4],[1,4]] result: ['D','B','A','C','E']")
    void t1(){
        n=5;
        ladder = new int[][]{{1,3},{2,4},{1,4}};
        Assertions.assertThat(new Ladder_Game().start(n, ladder)).isEqualTo(new char[]{'D','B','A','C','E'});
    }

    @Test
    @DisplayName("n:7, ladder: [[1,3,5],[1,3,6],[2,4]] result: ['A','C','B','F','D','G','E']")
    void t2(){
        n=7;
        ladder = new int[][]{{1,3,5},{1,3,6},{2,4}};
        Assertions.assertThat(new Ladder_Game().start(n, ladder)).isEqualTo(new char[]{'A','C','B','F','D','G','E'});
    }

}