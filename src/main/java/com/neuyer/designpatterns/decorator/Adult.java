package com.neuyer.designpatterns.decorator;

public class Adult extends ManDecorator {

    final String ADULT_QUOTE = "OH Shit! I'm married... ";

    public Adult(ManInterface man) {
        super(man);
    }

    @Override
    public String live() {
        return super.live() + ADULT_QUOTE;
    }
}
