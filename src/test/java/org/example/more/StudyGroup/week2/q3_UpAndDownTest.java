package org.example.more.StudyGroup.week2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q3_UpAndDownTest {
    @Test
    void t1(){
        int[] arr= {1, 2, 3, 4, 5, 3, 1};
        Assertions.assertThat(new q3_UpAndDown().isUpAndDown(arr)).isEqualTo(true);
    }
    @Test
    void t2(){
        int[] arr= {1, 3, 4, 5, 5, 6, 4, 3};
        Assertions.assertThat(new q3_UpAndDown().isUpAndDown(arr)).isEqualTo(false);
    }
    @Test
    void t3(){
        int[] arr= {1, 2, 3, 4, 5};
        Assertions.assertThat(new q3_UpAndDown().isUpAndDown(arr)).isEqualTo(false);
    }
    @Test
    void t4(){
        int[] arr= {1, 2, 3, 4, 5, 4, 3, 4, 5};
        Assertions.assertThat(new q3_UpAndDown().isUpAndDown(arr)).isEqualTo(false);
    }
}