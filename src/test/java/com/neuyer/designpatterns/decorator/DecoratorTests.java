package com.neuyer.designpatterns.decorator;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorTests {

    Logger logger = LoggerFactory.getLogger(DecoratorTests.class);

    @Test
    public void decoratorTest(){
        Man man = new Man();
        Baby baby = new Baby(man);
        Boy boy = new Boy(baby);
        Teenager teenager = new Teenager(boy);
        Adult adult = new Adult(teenager);
        Elder elder = new Elder(adult);
        logger.info(elder.live());
    }

}
