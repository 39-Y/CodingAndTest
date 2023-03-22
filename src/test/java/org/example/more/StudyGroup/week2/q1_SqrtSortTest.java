package org.example.more.StudyGroup.week2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q1_SqrtSortTest {
    @Test
    void t1(){
        int[] arr = {0, 1, 9, 16, 100};
        int[] input = {-4, -1, 0, 3, 10};
        Assertions.assertThat(new q1_SqrtSort().sort(input)).isEqualTo(arr);
    }

    @Test
    void t2(){
        int[] arr = {4, 9, 9, 49, 121};
        int[] input = {-7, -3, 2, 3, 11};
        Assertions.assertThat(new q1_SqrtSort().sort(input)).isEqualTo(arr);
    }
}