package org.example.more.StudyGroup.week3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q1_BracketStackTest {
    @Test
    @DisplayName("() => true")
    void t1(){
        Assertions.assertThat(new q1_BracketStack().isBracketPair("()")).isEqualTo(true);
    }

    @Test
    @DisplayName("))( => true")
    void t2(){
        Assertions.assertThat(new q1_BracketStack().isBracketPair("))(")).isEqualTo(false);
    }

    @Test
    @DisplayName("(())() => true")
    void t3(){
        Assertions.assertThat(new q1_BracketStack().isBracketPair("(())()")).isEqualTo(true);
    }

    @Test
    @DisplayName("(()())) => false")
    void t4(){
        Assertions.assertThat(new q1_BracketStack().isBracketPair("(()()))")).isEqualTo(false);
    }

    @Test
    @DisplayName("(()(()))(() => false")
    void t5(){
        Assertions.assertThat(new q1_BracketStack().isBracketPair("(()(()))(()")).isEqualTo(false);
    }


}