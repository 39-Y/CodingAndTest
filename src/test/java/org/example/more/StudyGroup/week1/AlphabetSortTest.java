package org.example.more.StudyGroup.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSortTest {
    @Test
    @DisplayName("a#b!GE*T@S -> S#T!EG*b@a")
    void t1(){
        assertThat(new AlphabetSort().sort("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
    }


    @Test
    @DisplayName("###ab*@@Sty -> ###yt*@@Sba")
    void t2(){
        assertThat(new AlphabetSort().sort("###ab*@@Sty")).isEqualTo("###yt*@@Sba");
    }
}