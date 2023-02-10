package com.kingcode;

public class ParrotImpl implements Parrot {

    public static final double BASE_SPEED = 12.0;
    public static final double MAX_NUM = 24.0;
    public static final double LOAD_FACTOR = 9.0;
    private final ParrotTypeEnum type;
    private final double voltage;
    private final boolean isNailed;

    public ParrotImpl(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_NUM, voltage * BASE_SPEED);
    }

}
