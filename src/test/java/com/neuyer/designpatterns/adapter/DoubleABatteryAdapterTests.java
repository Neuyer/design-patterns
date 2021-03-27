package com.neuyer.designpatterns.adapter;

import com.neuyer.designpatterns.model.DoubleABattery;
import com.neuyer.designpatterns.model.BatterySize;
import com.neuyer.designpatterns.model.BatteryVoltage;
import com.neuyer.designpatterns.model.RemoteController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleABatteryAdapterTests {

    @Test
    public void shouldAdaptBatteryTest() {
        DoubleABattery doubleABattery = new DoubleABattery(BatteryVoltage.STANDARD_VOLTAGE);
        DoubleABatteryAdapter adapter = new DoubleABatteryAdapter(doubleABattery);
        RemoteController remoteController = new RemoteController(adapter);
        Assertions.assertNotNull(remoteController.getBattery());
        Assertions.assertEquals(remoteController.getBattery().getVoltage(), BatteryVoltage.STANDARD_VOLTAGE);
        Assertions.assertEquals(remoteController.getBattery().getSize(), BatterySize.SMALL);
    }

    @Test
    public void shouldThrowExceptionTest() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            DoubleABattery battery = new DoubleABattery(BatteryVoltage.HiGH_VOLTAGE);
            DoubleABatteryAdapter adapter = new DoubleABatteryAdapter(battery);
            RemoteController remoteController = new RemoteController(adapter);
        });
    }

}
