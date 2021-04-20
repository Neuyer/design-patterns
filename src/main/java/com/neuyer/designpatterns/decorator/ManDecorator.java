package com.neuyer.designpatterns.decorator;

public class ManDecorator implements ManInterface {

    protected  ManInterface man;

    public ManDecorator(ManInterface man) {
        this.man = man;
    }

    @Override
    public String live() {
        return man.live();
    }
}
