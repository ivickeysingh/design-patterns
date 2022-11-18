package patterns.factory.impl;

import patterns.factory.Pizza;
import patterns.factory.PizzaIngredientsFactory;
import patterns.factory.PizzaType;

public class VeggiePizza extends Pizza {
    private PizzaIngredientsFactory ingredientsFactory;

    public VeggiePizza(final PizzaIngredientsFactory ingredientsFactory, final String name) {
        super(name, PizzaType.VEGGIE);
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare() {
        setCheese(ingredientsFactory.createCheese());
        setDough(ingredientsFactory.createDough());
    }
}
