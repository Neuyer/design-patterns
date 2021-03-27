package com.neuyer.designpatterns.model;

public class TripleABattery extends Battery {

    private BatterySize size = BatterySize.SMALL;
    private BatteryVoltage voltage;

    public TripleABattery() {

    }


    public TripleABattery(BatteryVoltage voltage) {
        super(voltage);
    }

    @Override
    public BatterySize getSize() {
        return size;
    }
}
