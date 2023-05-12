package org.example.Lv2.TargerNum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    int[] numbers;
    int target;

    @Test
    @DisplayName("[4, 1, 2, 1]로 숫자 4: 2")
    void t1(){
        numbers = new int[]{4, 1, 2, 1};
        target = 4;
        Assertions.assertThat(new Solution().solution(numbers,target)).isEqualTo(2);
    }
    @Test
    @DisplayName("[1, 1, 1, 1, 1]로 숫자 3: 5")
    void t2(){
        numbers = new int[]{1, 1, 1, 1, 1};
        target = 3;
        Assertions.assertThat(new Solution().solution(numbers,target)).isEqualTo(5);
    }
}