package com.neuyer.designpatterns.decorator;

public class Baby extends ManDecorator {

    final String BABY_QUOTE = "GUGU-DADah ";

    public Baby(ManInterface man) {
        super(man);
    }

    @Override
    public String live() {
        return super.live() + BABY_QUOTE;
    }
}
