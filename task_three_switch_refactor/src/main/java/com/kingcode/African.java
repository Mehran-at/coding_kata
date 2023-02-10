package com.kingcode;

public class African implements Parrot {

    public static final double BASE_SPEED = 12.0;
    public static final int MAX_NUM = 0;
    public static final double LOAD_FACTOR = 9.0;

    private final int numberOfCoconuts;

    public African(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(MAX_NUM, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}