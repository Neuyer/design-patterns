package com.neuyer.designpatterns.decorator;

public class Elder extends ManDecorator {

    final String ELDER_QUOTE = "Thanks God I'm dying 😃";

    public Elder(ManInterface man) {
        super(man);
    }

    @Override
    public String live() {
        return super.live() + ELDER_QUOTE;
    }
}
