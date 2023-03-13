package org.example.Lv0.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
        @Test
        @DisplayName("입력된 숫자 확인")
        void t1(){
                assertThat(new Solution().solution(0)).isEqualTo(0);
        }

        @Test
        @DisplayName("스트림으로 합을 구하기")
        void t(){
                assertThat(new Solution().solution(25)).isEqualTo(7);
        }
}