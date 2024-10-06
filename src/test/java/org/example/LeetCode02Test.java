package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode02Test {
    @Test
    void isPalindrome(){
        LeetCode02 leetCode02 = new LeetCode02();
        boolean actual = leetCode02.isPalindrome(1123211);
        assertEquals(true, actual);
    }
}
