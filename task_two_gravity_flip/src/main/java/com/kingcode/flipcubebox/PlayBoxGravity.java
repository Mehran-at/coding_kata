package com.kingcode.flipcubebox;


import com.kingcode.gamecomponents.Cube;
import com.kingcode.gamecomponents.Direction;
import com.kingcode.gravitylogic.GravityToLeft;
import com.kingcode.gravitylogic.GravityToRight;

public class PlayBoxGravity {

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
}
