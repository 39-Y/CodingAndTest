package org.example.more.StudyGroup.week6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q2_ShortCutTest {
    @Test
    @DisplayName("")
    void t1(){
        Assertions.assertThat(new q2_ShortCut().find()).isEqualTo(12);

    }
}