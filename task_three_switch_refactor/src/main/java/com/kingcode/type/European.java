package com.kingcode.type;

import com.kingcode.Parrot;

public class European implements Parrot {

    private final static double BASE_SPEED = 12.0;

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}
