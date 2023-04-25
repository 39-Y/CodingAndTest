package org.example.Lv2.joyStick;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JoyStickTest {
    @Test
    @DisplayName(" ")
    void t1(){
        Assertions.assertThat(new Solution().solution("JAZ")).isEqualTo(11);
    }

    @Test
    @DisplayName("JEROEN => 56")
    void t2(){
        Assertions.assertThat(new Solution().solution("JEROEN")).isEqualTo(56);
    }

    @Test
    @DisplayName("AAA => 0")
    void t3(){
        Assertions.assertThat(new Solution().solution("AAA")).isEqualTo(0);
    }

    @Test
    @DisplayName("LABLPAJM => 61")
    void t4(){
        Assertions.assertThat(new Solution().solution("LABLPAJM")).isEqualTo(61);
    }

}