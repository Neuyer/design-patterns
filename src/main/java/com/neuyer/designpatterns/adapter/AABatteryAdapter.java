package com.neuyer.designpatterns.adapter;

import com.neuyer.designpatterns.model.AAABattery;
import com.neuyer.designpatterns.model.AABattery;

public class AABatteryAdapter extends AAABattery {

     private AABattery aaBattery;

    public AABatteryAdapter(AABattery aaBattery) {
        this.aaBattery = aaBattery;
    }

    public AAABattery adaptedBattery(){
        AAABattery aaaBattery = new AAABattery();
        if (aaBattery.getVoltage() != aaaBattery.getVoltage()) throw new RuntimeException("wrong battery voltage");
        return new AAABattery();
    }
}
