package com.kingcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    public void testGcd() {
        assertEquals(50, GreatestCommonDivisor.compute(50,100));
        assertEquals(1, GreatestCommonDivisor.compute(100,101));
        assertEquals(101, GreatestCommonDivisor.compute(101,101));
        assertEquals(6, GreatestCommonDivisor.compute(6,12));
        assertEquals(6, GreatestCommonDivisor.compute(30,12));
        assertEquals(1, GreatestCommonDivisor.compute(8,9));
        assertEquals(1, GreatestCommonDivisor.compute(1,1));
    }
}