package com.neuyer.designpatterns.decorator;

public class Man implements ManInterface {

    final String MAN_QUOTE = "I`m living... ";

    @Override
    public String live() {
        return MAN_QUOTE;
    }
}
