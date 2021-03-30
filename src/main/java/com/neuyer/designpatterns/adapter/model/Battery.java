package com.neuyer.designpatterns.adapter.model;

public class Battery {
    private BatteryVoltage voltage;
    private BatterySize size;


    public Battery(BatteryVoltage voltage) {
        this.voltage = voltage;
    }

    public Battery() {

    }

    public BatteryVoltage getVoltage() {
        return voltage;
    }

    public BatterySize getSize() {
        return size;
    }
}
