package org.example.more.StudyGroup.week3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q3_AbsolutePopTest {
    @Test
    @DisplayName("[3, 5, -2, -5] => 3")
    void t1(){
        int[] nums = {3, 5, -2, -5};
        Assertions.assertThat(new q3_AbsolutePop().crush(nums)).isEqualTo(new Integer[]{3});
    }

    @Test
    @DisplayName("[-2, -1, -3,  1, 3] =>[-2, -1, -3,  1, 3]")
    void t2(){
        int[] nums = {-2, -1, -3,  1, 3};
        Assertions.assertThat(new q3_AbsolutePop().crush(nums)).isEqualTo(new Integer[]{-2, -1, -3,  1, 3});
    }

      @Test
    @DisplayName("[-2, -1,  2, 1, -3, 2] =>[-2, -1, -3, 2]")
    void t3(){
        int[] nums = {-2, -1,  2, 1, -3, 2};
        Assertions.assertThat(new q3_AbsolutePop().crush(nums)).isEqualTo(new Integer[]{-2, -1, -3, 2});
    }



}