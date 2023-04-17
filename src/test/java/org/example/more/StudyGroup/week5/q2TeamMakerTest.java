package org.example.more.StudyGroup.week5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class q2TeamMakerTest {
    int chance;
    Integer[] teamMember;
    @Test
    @DisplayName("cards: [2, 8, 3, 6, 1, 9, 1, 9], count: 2 => 21")
    void t1(){
        teamMember = new Integer[]{2, 8, 3, 6, 1, 9, 1, 9};
        chance = 2;
        Assertions.assertThat(new q2TeamMaker(teamMember, chance).grouping()).isEqualTo(21);
    }

    @Test
    @DisplayName("cards: [7, 6, 8, 9, 10], count: 1 => 22")
    void t2(){
        teamMember = new Integer[]{7, 6, 8, 9, 10};
        chance = 1;
        Assertions.assertThat(new q2TeamMaker(teamMember, chance).grouping()).isEqualTo(22);
    }

}