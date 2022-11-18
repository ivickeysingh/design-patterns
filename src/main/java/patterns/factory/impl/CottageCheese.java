package patterns.factory.impl;

import patterns.factory.Cheese;
import patterns.factory.CheeseType;

public class CottageCheese extends Cheese {

    public CottageCheese(){
        super(CheeseType.COTTAGE);
    }
}
