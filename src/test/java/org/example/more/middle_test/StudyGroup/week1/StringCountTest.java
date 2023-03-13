package org.example.more.middle_test.StudyGroup.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCountTest {
    @Test
    @DisplayName("'AA' -> 'A1")
    void t1(){
        String s = "AA";
        assertThat(StringCount.count(s)).isEqualTo("A1");
    }

    @Test
    @DisplayName("'AAB' => 'A1B'")
    void t2(){
        String s = "AAB";
        assertThat(StringCount.count(s)).isEqualTo("A1B");
    }

    @Test
    @DisplayName("'AAABB' => 'A2B1'")
    void t3(){
        String s = "AAABB";
        assertThat(StringCount.count(s)).isEqualTo("A2B1");
    }

    @Test
    @DisplayName("'AABCCC' => 'A1BC2'")
    void t4(){
        String s = "AABCCC";
        assertThat(StringCount.count(s)).isEqualTo("A1BC2");
    }

    @Test
    @DisplayName("'KKHSSSSSSSE' => 'K1HS6E'")
    void t5(){
        String s = "KKHSSSSSSSE";
        assertThat(StringCount.count(s)).isEqualTo("K1HS6E");
    }

}