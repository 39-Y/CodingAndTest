package org.example.more.middle_test.MiddleTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class LeastCommonMultipleTest {
    @Test
    @DisplayName("1~5=> 60")
    void t1(){
         assertThat(new LeastCommonMultiple().find(5)).isEqualTo(60);
    }

    @Test
    @DisplayName("1~10=> 2520")
    void t2(){
        assertThat(new LeastCommonMultiple().find(10)).isEqualTo(2520);
    }

    @Test
    @DisplayName("1~23=> ?")
    void t3(){
        assertThat(new LeastCommonMultiple().find(23)).isEqualTo(2520);
    }

}