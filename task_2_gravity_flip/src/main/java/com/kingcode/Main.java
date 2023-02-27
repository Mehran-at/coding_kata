package com.kingcode;

import com.kingcode.flipcubebox.PlayBoxGravity;
import com.kingcode.gamecomponents.Cube;
import com.kingcode.gamecomponents.Direction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlayBoxGravity playBoxGravity = new PlayBoxGravity();
        // must output  [5, 5, 4, 3, 1]
        System.out.println(Arrays.toString(playBoxGravity.flip(new Direction('l'), new Cube(new int[]{1, 4, 5, 3, 5}))));
        System.out.println(Arrays.toString(playBoxGravity.flip(new Direction('r'), new Cube(new int[]{3, 2, 1, 2}))));

        System.out.println("------------------");
        System.out.println(Arrays.toString(playBoxGravity.flipWithStream('L', new int[]{1, 4, 5, 3, 5})));
        System.out.println("------------------");
        System.out.println(Arrays.toString(playBoxGravity.flipWithStreamAndCondition('L', new int[]{1, 4, 5, 3, 5})));
        System.out.println("------------------");
        System.out.println(Arrays.toString(playBoxGravity.flipWithStreamAndConditionAndComparator('L', new int[]{1, 4, 5, 3, 5})));
        System.out.println("------------------>");
        System.out.println(Arrays.toString(PlayBoxGravity.flipWithStreamAndConditionAndComparatorReversedOrderMostOptimized('L', new int[]{3, 2, 1, 2})));
    }
}