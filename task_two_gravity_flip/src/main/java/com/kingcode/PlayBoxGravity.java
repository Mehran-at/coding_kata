package com.kingcode;

import java.util.Arrays;

public class PlayBoxGravity {

    void play(String direction, int[] cubes) {
//        int numberOfColumns = getNumberOfColumns(new int[]{1, 2});
        calculateForGravityLeft(cubes);
        System.out.println(Arrays.toString(cubes));

    }

    public int[] calculateForGravityLeft(int[] cubes) {
//        {1, 4, 5, 3, 5}
//        [5, 5, 4, 3, 1]
        int length = cubes.length;
        do {
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
        while (cubes[0] < cubes[1]);
        return cubes;

    }

    public int getNumberOfColumns(int[] cubes) {
        return cubes.length;
    }
}
