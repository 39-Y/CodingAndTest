package org.example.Lv0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("입력된 숫자 확인")
    void t1(){
        assertThat(new Solution().solution(29)).isEqualTo(29);
    }

    @Test
    @DisplayName("입력된 숫자 확인")
    void t2(){
        assertThat(new Solution().solution(29)).isEqualTo(7);
    }
}