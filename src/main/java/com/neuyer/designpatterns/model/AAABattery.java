package com.neuyer.designpatterns.model;

public class AAABattery extends Battery {

    private BatterySize size = BatterySize.SMALL;

    @Override
    public BatterySize getSize() {
        return size;
    }
}
