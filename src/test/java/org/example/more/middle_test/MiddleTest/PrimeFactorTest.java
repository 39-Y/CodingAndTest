package org.example.more.middle_test.MiddleTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorTest {
    @Test
    @DisplayName("10 -> 5")
    void t1(){
        assertThat(new PrimeFactor().max(10)).isEqualTo(5);
    }

    @Test
    @DisplayName("13195 -> 29")
    void t2(){
        assertThat(new PrimeFactor().max(13195)).isEqualTo(29);
    }

    @Test
    @DisplayName("Long.MAX_VALUE -> 649657")
    void t3(){
        assertThat(new PrimeFactor().max(Long.MAX_VALUE)).isEqualTo(649657);
    }

}