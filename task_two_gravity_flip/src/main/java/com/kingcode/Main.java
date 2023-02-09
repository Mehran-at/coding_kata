package com.kingcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlayBoxGravity playBoxGravity = new PlayBoxGravity();
        playBoxGravity.flip('l', new int[]{1, 2, 5, 3, 5}); // must output  [5, 5, 4, 3, 1]
        System.out.println(Arrays.toString(playBoxGravity.flip('l', new int[]{1, 2, 5, 3, 5})));
    }
}