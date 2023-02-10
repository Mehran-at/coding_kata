package com.kingcode.flipcubebox;

import com.kingcode.gamecomponents.Cube;
import com.kingcode.gamecomponents.Direction;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlayBoxGravityTest {

    @Test
    void testGravityToLeft() {
        PlayBoxGravity playBoxGravity = new PlayBoxGravity();
        int[] expected = playBoxGravity.flip(new Direction('l'), new Cube(new int[]{1, 4, 5, 3, 5 }));
        int[] actual = {5, 5, 4, 3, 1};
        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }
}