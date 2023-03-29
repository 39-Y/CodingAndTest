package org.example.more.StudyGroup.week2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class q10_PickStudentTest {

    @Test
    void t1(){
        int[][] votes = {{0, 1}, {0, 3}, {1, 2}, {2, 0}, {2, 3}, {3, 0}};
        int[] answer = {1,0,2,1};
        Assertions.assertThat(new q10_PickStudent(votes, 2, 4).countEmail()).isEqualTo(answer);
    }
}