package patterns.factory.impl;

import patterns.factory.Cheese;
import patterns.factory.Dough;
import patterns.factory.PizzaIngredientsFactory;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {
    public Dough createDough() {
        return new PizzaDough();
    }

    public Cheese createCheese() {
        return new CheddarCheese();
    }
}
