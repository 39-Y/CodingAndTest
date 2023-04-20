package org.example.more.StudyGroup.week6;

import org.assertj.core.api.Assertions;
import org.example.more.StudyGroup.week5.q2TeamMaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q1_CatchTheCowTest {
    @Test
    @DisplayName("man:5 // cow:14 => 3")
    void t1(){
        Assertions.assertThat(new q1_CatchTheCow(5,14).find()).isEqualTo(3);

    }

    @Test
    @DisplayName("man:8 // cow:3 => 5")
    void t2(){
        Assertions.assertThat(new q1_CatchTheCow(8,3).find()).isEqualTo(5);

    }

    @Test
    @DisplayName("man:8 // cow:8 => 0")
    void t3(){
        Assertions.assertThat(new q1_CatchTheCow(8,8).find()).isEqualTo(0);

    }

    @Test
    @DisplayName("man:3 // cow:8 => 1")
    void t4(){
        Assertions.assertThat(new q1_CatchTheCow(3,8).find()).isEqualTo(1);

    }
}