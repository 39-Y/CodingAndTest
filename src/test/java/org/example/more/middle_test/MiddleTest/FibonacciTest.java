package org.example.more.middle_test.MiddleTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {
    @Test
    @DisplayName("3 -> 2")
    void t1(){
        assertThat(new Fibonacci().evenSum(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("10 -> 10")
    void t2(){
        assertThat(new Fibonacci().evenSum(10)).isEqualTo(10);
    }

    @Test
    @DisplayName("40 -> 44")
    void t3(){
        assertThat(new Fibonacci().evenSum(40)).isEqualTo(44);
    }

    @Test
    @DisplayName("300 -> 188")
    void t4(){
        assertThat(new Fibonacci().evenSum(300)).isEqualTo(188);
    }

    @Test
    @DisplayName("50000000 -> ??")
    void t5(){
        assertThat(new Fibonacci().evenSum(50000000)).isEqualTo(19544084L);
    }



}