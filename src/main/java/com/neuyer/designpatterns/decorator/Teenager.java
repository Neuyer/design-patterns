package com.neuyer.designpatterns.decorator;

public class Teenager extends ManDecorator {

    final String TEENAGER_QUOTE = "NICE!!!, I'm drunk... ";

    public Teenager(ManInterface man) {
        super(man);
    }

    @Override
    public String live() {
        return super.live() + TEENAGER_QUOTE;
    }
}
