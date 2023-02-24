package com.kingcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    public void testGcd() {
        assertEquals(6, GreatestCommonDivisor.compute(30,12));
        assertEquals(1, GreatestCommonDivisor.compute(8,9));
        assertEquals(1, GreatestCommonDivisor.compute(1,1));
    }
}