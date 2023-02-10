package com.kingcode.gravitylogic;

public class GravityToLeft {

    public int[] calculateForGravityLeft(int[] cubes) {
        for (int ignored : cubes) {
            for (int cube = 0; cube < cubes.length - 1; cube++) {
                int columnRight = cubes[cube + 1];
                int columnLeft = cubes[cube];

                moveCubesToTheLeftColumn(cubes, cube, columnRight, columnLeft);
            }
        }
        return cubes;
    }

    private void moveCubesToTheLeftColumn(int[] cubes, int cube, int columnRight, int columnLeft) {
        if (columnRight - columnLeft > 0) {
            cubes[cube] = (columnRight - columnLeft) + columnLeft;
            cubes[cube + 1] = columnRight - (columnRight - columnLeft);
        }
    }
}
