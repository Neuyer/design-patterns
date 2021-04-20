package com.neuyer.designpatterns.decorator;

public class Boy extends ManDecorator {

    final String BOY_QUOTE = "I hate school... ";

    public Boy(ManInterface man) {
        super(man);
    }

    @Override
    public String live() {
        return super.live() + BOY_QUOTE;
    }
}
