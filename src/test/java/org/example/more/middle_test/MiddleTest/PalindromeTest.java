package org.example.more.middle_test.MiddleTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {
    @Test
    @DisplayName("둘째 자리 중 대칭수 중 가장 큰수")
    void t1(){
        assertThat(new Palindrome().maxPalindrome(2)).isEqualTo(9009);
    }
    @Test
    @DisplayName("셋째 자리 중 대칭수 중 가장 큰수")
    void t2(){
        assertThat(new Palindrome().maxPalindrome(3)).isEqualTo(906609);
    }
    @Test
    @DisplayName("넷째 자리 중 대칭수 중 가장 큰수")
    void t3(){
        assertThat(new Palindrome().maxPalindrome(4)).isEqualTo(99000099L);
    }
}