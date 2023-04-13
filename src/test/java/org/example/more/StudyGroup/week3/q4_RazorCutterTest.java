package org.example.more.StudyGroup.week3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q4_RazorCutterTest {
    @Test
    @DisplayName("()(((()())(())()))(()) => 17")
    void t1(){
        Assertions.assertThat(new q4_RazorCutter().cut("()(((()())(())()))(())")).isEqualTo(17);
    }

}