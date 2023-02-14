package com.kingcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayTest {

    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(3, Play.solution(1, 6));
        assertEquals(2, Play.solution(1, 5));
        assertEquals(3, Play.solution(1, 4));
        assertEquals(2, Play.solution(1, 3));
        assertEquals(1, Play.solution(1, 2));
        assertEquals(-1, Play.solution(-1, 2));
        assertEquals(-1, Play.solution(-1, 1));
    }
}