package org.example.more.StudyGroup.week3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q2_RemoveInBracketTest {
    @Test
    @DisplayName("(A)B => B")
    void t1(){
        Assertions.assertThat(new q2_RemoveInBracket().remove("(A)B")).isEqualTo("B");
    }

    @Test
    @DisplayName("(A)C(B) => ")
    void t2(){
        Assertions.assertThat(new q2_RemoveInBracket().remove("(A)C(B)")).isEqualTo("C");
    }

    @Test
    @DisplayName("(A(BC)D)EF(G(H)(IJ)K)LM(N) => EFLM")
    void t3(){
        Assertions.assertThat(new q2_RemoveInBracket().remove("(A(BC)D)EF(G(H)(IJ)K)LM(N)")).isEqualTo("EFLM");
    }

}