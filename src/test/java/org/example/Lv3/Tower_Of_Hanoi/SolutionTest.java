package org.example.Lv3.Tower_Of_Hanoi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("n:1 => {1,3}")
    void t1(){
        Assertions.assertThat(new Solution().count(1)).isEqualTo(new int[][] {{1,3}});
    }

    @Test
    @DisplayName("n:2 => {1,2}, {1,3}, {2,3}")
    void t2(){
        Assertions.assertThat(new Solution().count(2)).isEqualTo(new int[][] {{1,2}, {1,3}, {2,3}});
    }

}