package com.kingcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatedTest {
    @Test
    public void test1() {
        final String input = "test";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        final Character expected = 'e';
        assertEquals(expected, output);
    }

    @Test
    public void test2() {
        final String input = "teeter";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        final Character expected = 'r';
        assertEquals(expected, output);
    }

    @Test
    public void test3() {
        final String input = "1122321235121222";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        final Character expected = '5';
        assertEquals(expected, output);
    }

    @Test
    public void test4() {
        final String input = "trend";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        final Character expected = 't';
        assertEquals(expected, output);
    }

    @Test
    public void test5() {
        final String input = "aabbcc";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        final Character expected = 0;
        assertEquals(expected,output);
    }

    @Test
    @Disabled
    public void test6() {
        final String input = "aabbcc";
        final Character output = FirstNonRepeated.findFirstNonRepeated(input);
        assertNull(output);
    }
}