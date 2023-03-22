package org.example.more.StudyGroup.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class LoosePalindromeTest {
    @Test
    @DisplayName("abcbdcba -> YES")
    void t1(){
        assertThat(new LoosePalindrome().isPalindrome("abcbdcba")).isEqualTo("YES");
    }

    @Test
    @DisplayName("abcabbakcba -> YES")
    void t2(){
        assertThat(new LoosePalindrome().isPalindrome("abcabbakcba")).isEqualTo("YES");
    }

    @Test
    @DisplayName("abcacbakcba -> NO")
    void t3(){
        assertThat(new LoosePalindrome().isPalindrome("abcacbakcba")).isEqualTo("NO");
    }

}