package org.example.more.StudyGroup.week4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class q8_AppleTest {
    int[] apples;
    int[] energy;
    int booster;

    @Test
    @DisplayName("apples: [2,3,4,5] energy: [1,0,0,0] booster: 0")
    void t1(){
        apples = new int[]{2,3,4,5};
        energy = new int[]{1, 0, 0, 0};
        booster = 0;
        Assertions.assertThat(new q8_Apple(apples, energy, booster).max()).isEqualTo(2);
    }

    @Test
    @DisplayName("apples: [2,3,4,5] energy: [1,0,0,0] booster: 3")
    void t2(){
        apples = new int[]{2,3,4,5};
        energy = new int[]{1, 0, 0, 0};
        booster = 3;
        Assertions.assertThat(new q8_Apple(apples, energy, booster).max()).isEqualTo(14);
    }

    @Test
    @DisplayName("apples: [2,3,4,5] energy: [1,0,0,0] booster: 2")
    void t3(){
        apples = new int[]{2,3,4,5};
        energy = new int[]{1, 0, 0, 0};
        booster = 2;
        Assertions.assertThat(new q8_Apple(apples, energy, booster).max()).isEqualTo(11);
    }

    @Test
    @DisplayName("apples: [3, 2, 1, 2, 1, 3] energy: [[1, 0, 0, 1, 0, 0] booster: 2")
    void t4(){
        apples = new int[]{3, 2, 1, 2, 1, 3};
        energy = new int[]{1, 0, 0, 1, 0, 0};
        booster = 2;
        Assertions.assertThat(new q8_Apple(apples, energy, booster).max()).isEqualTo(9);
    }

    @Test
    @DisplayName("apples: [3, 2, 3, 2, 1, 3] energy: [[1, 0, 0, 1, 0, 0] booster: 10")
    void t5(){
        apples = new int[]{3, 2, 3, 2, 1, 3};
        energy = new int[]{1, 0, 0, 1, 0, 0};
        booster = 3;
        Assertions.assertThat(new q8_Apple(apples, energy, booster).max()).isEqualTo(10);
    }

}