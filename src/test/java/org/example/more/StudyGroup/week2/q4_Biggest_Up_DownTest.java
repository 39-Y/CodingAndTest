package org.example.more.StudyGroup.week2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q4_Biggest_Up_DownTest {
    @Test
    void t1(){
        int[] arr = {1, 3, 2, 5, 7, 4, 2, 5, 1};
        Assertions.assertThat(new q4_Biggest_Up_Down().maxCount(arr)).isEqualTo(5);
    }

}