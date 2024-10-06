package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode01Test {

    @Test
    void sum() {
        Method method = new Method();
        int[] m = {2,3,5,5};
        int[] n = {2,3};
        int[] actual = method.twoSum(m,10);

        assertEquals(actual[0], n[0]);
        assertEquals(actual[1], n[1]);
    }
}