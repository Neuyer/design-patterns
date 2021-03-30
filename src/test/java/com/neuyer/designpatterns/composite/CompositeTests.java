package com.neuyer.designpatterns.composite;

import com.neuyer.designpatterns.composite.model.Phone;
import com.neuyer.designpatterns.composite.model.Tv;
import com.neuyer.designpatterns.composite.model.VideoGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositeTests {

    @Test
    public void shouldCalcCostTest() {
        ProductComposite composite = new ProductComposite();
        composite.addComponent(new Tv(5, 100.0));
        composite.addComponent(new Tv(1, 100.0));
        composite.addComponent(new Tv(1, 100.0));
        composite.addComponent(new Phone(1, 50.0));
        composite.addComponent(new Phone(1, 50.0));
        composite.addComponent(new VideoGame(1, 15.0));
        composite.addComponent(new VideoGame(1, 15.0));
        composite.addComponent(new VideoGame(2, 15.0));

        Assertions.assertEquals(860.00, composite.calcCost());
    }
}
