package org.example.more.StudyGroup.week4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class q2_PickCardTest {
    int[] cards;
    int count;
    @Test
    @DisplayName("cards: [2, 3, 7, 1, 2, 1, 5], count: 4 => 17")
    void t1(){
        cards = new int[]{2, 3, 7, 1, 2, 1, 5};
        count = 4;
        Assertions.assertThat(new q2_PickCard(count, cards).maxPick()).isEqualTo(17);
    }

    @Test
    @DisplayName("cards: [1, 2, 3, 5, 6, 7, 1, 3, 9], count: 5 => 26")
    void t2(){
        cards = new int[]{2, 3, 7, 1, 2, 1, 5};
        count = 5;
        Assertions.assertThat(new q2_PickCard(count, cards).maxPick()).isEqualTo(26);
    }
}