package com.kingcode;

public class Norwegian implements Parrot {

    public static final double BASE_SPEED = 12.0;
    public static final double MAX_NUM = 24.0;
    private final double voltage;
    private final boolean isNailed;

    public Norwegian(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
            return isNailed ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_NUM, voltage * BASE_SPEED);
    }
}
