package com.neuyer.designpatterns.adapter;

import com.neuyer.designpatterns.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AABatteryAdapterTests {

    @Test
    public void shouldAdaptBattery() {
        AABattery aaBattery = new AABattery();
        AABatteryAdapter adapter = new AABatteryAdapter(aaBattery);
        RemoteController remoteController = new RemoteController(adapter.adaptedBattery());
        Assertions.assertNotNull(remoteController.getBattery());
        Assertions.assertEquals(remoteController.getBattery().getVoltage(), BatteryVoltage.STANDARD_VOLTAGE);
        Assertions.assertEquals(remoteController.getBattery().getSize(), BatterySize.SMALL);
    }

    @Test
    public void shouldThrowException() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            AABattery battery = new AABattery();
            RemoteController remoteController = new RemoteController(battery);
        });
    }

}
