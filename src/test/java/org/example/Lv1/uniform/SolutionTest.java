package org.example.Lv1.uniform;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    int[] lost;
    int[] reserve;
    @Test
    @DisplayName("n:5 //lost:[2, 4] //reserve: [1, 3, 5] =>5")
    void t1(){
        lost = new int[]{2,4};
        reserve = new int[]{1,3,5};
        Assertions.assertThat(new Solution().solution(5,lost,reserve)).isEqualTo(5);
    }
    @Test
    @DisplayName("n:4 //lost:[2, 3] //reserve: [3,4] =>3")
    void t2(){
        lost = new int[]{2,3};
        reserve = new int[]{3,4};
        Assertions.assertThat(new Solution().solution(4,lost,reserve)).isEqualTo(3);
    }
}