package com.neuyer.designpatterns.model;

public class DoubleABattery extends Battery {

    private BatterySize size = BatterySize.MEDIUM;
    private BatteryVoltage voltage;


    public DoubleABattery(BatteryVoltage voltage) {
        super(voltage);
    }

    public DoubleABattery() {

    }


    @Override
    public BatterySize getSize() {
        return size;
    }
}
