package patterns.factory.impl;

import patterns.factory.Dough;
import patterns.factory.DoughType;

public class PastaDough extends Dough {

    public PastaDough() {
        super(DoughType.PASTA);
    }
}
