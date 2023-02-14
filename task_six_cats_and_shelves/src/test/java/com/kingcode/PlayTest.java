package com.kingcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayTest {

    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(1, new PlayGame().solution(1, 2));
        assertEquals(2, new PlayGame().solution(1, 3));
        assertEquals(1, new PlayGame().solution(1, 4));
        assertEquals(2, new PlayGame().solution(1, 5));
        assertEquals(3, new PlayGame().solution(1, 6));
        assertEquals(2, new PlayGame().solution(1, 7));
        assertEquals(3, new PlayGame().solution(1, 8));
        assertEquals(4, new PlayGame().solution(1, 9));
        assertEquals(3, new PlayGame().solution(1, 10));

        assertEquals(-1, new PlayGame().solution(2, 2));
        assertEquals(1, new PlayGame().solution(2, 3));
        assertEquals(2, new PlayGame().solution(2, 4));
        assertEquals(1, new PlayGame().solution(2, 5));
        assertEquals(2, new PlayGame().solution(2, 6));
        assertEquals(3, new PlayGame().solution(2, 7));
        assertEquals(2, new PlayGame().solution(2, 8));
        assertEquals(3, new PlayGame().solution(2, 9));
        assertEquals(4, new PlayGame().solution(2, 10));

        assertEquals(2, new PlayGame().solution(3, 9));
        assertEquals(4, new PlayGame().solution(1, 9));

        assertEquals(-1, new PlayGame().solution(-1, 2));
        assertEquals(-1, new PlayGame().solution(-1, 1));
        assertEquals(-1, new PlayGame().solution(4, 3));
    }
}