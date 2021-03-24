package com.neuyer.designpatterns.model;

public class Battery {
    private BatteryVoltage voltage = BatteryVoltage.STANDARD_VOLTAGE;
    private BatterySize size;

    public Battery() {
    }

    public BatteryVoltage getVoltage() {
        return voltage;
    }

    public BatterySize getSize() {
        return size;
    }
}
