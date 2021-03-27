package com.neuyer.designpatterns.adapter;

import com.neuyer.designpatterns.model.BatteryVoltage;
import com.neuyer.designpatterns.model.TripleABattery;
import com.neuyer.designpatterns.model.DoubleABattery;

public class DoubleABatteryAdapter extends TripleABattery {

    private DoubleABattery doubleABattery;

    public DoubleABatteryAdapter(DoubleABattery doubleABattery) {
        this.doubleABattery = doubleABattery;
    }

    @Override
    public BatteryVoltage getVoltage() {
        return doubleABattery.getVoltage();
    }
}
