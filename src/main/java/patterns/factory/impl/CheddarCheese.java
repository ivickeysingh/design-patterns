package patterns.factory.impl;

import patterns.factory.Cheese;
import patterns.factory.CheeseType;

public class CheddarCheese extends Cheese {

    public CheddarCheese(){
        super(CheeseType.CHEDDAR);
    }
}
