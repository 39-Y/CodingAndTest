package org.example.more.StudyGroup.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PalindromeTest {
    @Test
    @DisplayName("gooG -> YES")
    void t1(){
        assertThat(new Palindrome().isPalidrome("gooG")).isEqualTo("YES");

    }

    @Test
    @DisplayName("gooD -> NO")
    void t2(){
        assertThat(new Palindrome().isPalidrome("gooD")).isEqualTo("NO");

    }

    @Test
    @DisplayName("GoDOG -> YES")
    void t3(){
        assertThat(new Palindrome().isPalidrome("GoDOG")).isEqualTo("YES");

    }
}