package com.kingcode.flipcubebox;


import com.kingcode.gamecomponents.Cube;
import com.kingcode.gamecomponents.Direction;
import com.kingcode.gravitylogic.GravityToLeft;
import com.kingcode.gravitylogic.GravityToRight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PlayBoxGravity {

    private static int applyAsInt(Integer x) {
        return x;
    }

    public int[] flip(Direction direction1, Cube cube) {
        GravityToLeft gravityToLeft = new GravityToLeft();
        GravityToRight gravityToRight = new GravityToRight();
        if (direction1.direction() == 'l') {
            return gravityToLeft.calculateForGravityLeft(cube.cubes());
        }
        if (direction1.direction() == 'r') {
            return gravityToRight.calculateForGravityRight(cube.cubes());
        }
        return new int[0];
    }

    public int[] flipWithStream(char dir, int[] arr) {
        if (dir == 'L') {
            arr = Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            Arrays.sort(arr);
        }
        return arr;
    }

    public int[] flipWithStreamAndCondition(char dir, int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(dir == 'L' ? (a, b) -> b - a : (a, b) -> a - b)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] flipWithStreamAndConditionAndComparator(char dir, int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(dir == 'L' ? (a, b) -> b - a : Comparator.comparingInt(a -> a))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] flipWithStreamAndConditionAndComparatorReversedOrder(char dir, int[] arr) {
        return dir == 'R' ?
                Arrays.stream(arr).sorted().toArray()
                :
                Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(x -> x)
                .toArray();
    }

    public static int[] flipWithStreamAndConditionAndComparatorReversedOrderMostOptimized(char dir, int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(dir == 'L' ? (a, b) -> b - a : Comparator.reverseOrder())
                .mapToInt(PlayBoxGravity::applyAsInt)
                .toArray();
    }
}
