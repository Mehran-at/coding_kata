package com.kingcode.gravitylogic;

public class GravityToRight {

    public int[] calculateForGravityRight(int[] cubes) {
        for (int ignored : cubes) {
            for (int cube = cubes.length-1; cube > 0; cube--) {
                int columnLeft = cubes[cube - 1];
                int columnRight = cubes[cube];

                moveCubesToTheRightColumn(cubes, cube, columnLeft, columnRight);
            }
        }
        return cubes;
    }

    private void moveCubesToTheRightColumn(int[] cubes, int cube, int columnLeft, int columnRight) {
        if (columnRight < columnLeft) {
            cubes[cube] = columnRight + (columnLeft - columnRight);
            cubes[cube - 1] = columnLeft - (columnLeft + columnRight);
        }
    }
}
