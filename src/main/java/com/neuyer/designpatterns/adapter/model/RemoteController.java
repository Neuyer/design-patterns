package com.neuyer.designpatterns.adapter.model;

public class RemoteController {
    private Battery battery;

    public RemoteController(TripleABattery battery) {
        consumeEnergy(battery);
        this.battery = battery;
    }

    public void setBattery(TripleABattery battery) {
        consumeEnergy(battery);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void consumeEnergy(Battery battery) {
        if (battery.getVoltage() != BatteryVoltage.STANDARD_VOLTAGE) throw new RuntimeException("Wrong Voltage");
    }
}
