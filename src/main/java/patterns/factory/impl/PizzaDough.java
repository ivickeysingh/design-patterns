package patterns.factory.impl;

import patterns.factory.Dough;
import patterns.factory.DoughType;

public class PizzaDough extends Dough {

    public PizzaDough() {
        super(DoughType.PIZZA);
    }
}
