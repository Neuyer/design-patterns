package com.neuyer.designpatterns.model;

public class RemoteController {
    private Battery battery;

    public RemoteController(Battery battery) {
        checkBattery(battery);
        this.battery = battery;
    }

    public void setBattery(Battery battery) {
        checkBattery(battery);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void checkBattery(Battery battery) {
        if (battery.getSize() != BatterySize.SMALL) throw new RuntimeException("Wrong Battery");
    }
}
