package com.kingcode;

import com.kingcode.gamecomponents.Cube;
import com.kingcode.gamecomponents.Direction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlayBoxGravity playBoxGravity = new PlayBoxGravity();
        playBoxGravity.flip(new Direction('l'), new Cube(new int[]{1, 2, 5, 3, 5})); // must output  [5, 5, 4, 3, 1]
        System.out.println(Arrays.toString(playBoxGravity.flip(new Direction('l'), new Cube(new int[]{1, 2, 5, 3, 5}))));
    }
}