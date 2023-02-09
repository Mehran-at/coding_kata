package com.kingcode;

public class PlayBoxGravity {

    int[] flip(char direction, int[] cubes) {
        if (direction == 'l') {
            return calculateForGravityLeft(cubes);
        }
        if (direction == 'r') {
            return calculateForGravityRight(cubes);
        }
        return null;
    }

    private int[] calculateForGravityRight(int[] cubes) {
        return null;
    }

    private int[] calculateForGravityLeft(int[] cubes) {
        for (int c : cubes) {
            for (int cube = 0; cube < cubes.length - 1; cube++) {
                int columnRight = cubes[cube + 1];
                int columnLeft = cubes[cube];

                int leftColumnAfterMove;
                int rightColumnAfterMove;

                if (columnRight - columnLeft > 0) {
                    leftColumnAfterMove = (columnRight - columnLeft) + columnLeft;
                    rightColumnAfterMove = columnRight - (columnRight - columnLeft);
                    cubes[cube] = leftColumnAfterMove;
                    cubes[cube + 1] = rightColumnAfterMove;
                }
            }
        }
        return cubes;
    }
}
