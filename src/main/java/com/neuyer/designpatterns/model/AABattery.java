package com.neuyer.designpatterns.model;

public class AABattery extends Battery {

    private BatterySize size = BatterySize.MEDIUM;

    @Override
    public BatterySize getSize() {
        return size;
    }
}
