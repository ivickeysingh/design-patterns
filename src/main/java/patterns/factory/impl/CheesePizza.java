package patterns.factory.impl;

import patterns.factory.Pizza;
import patterns.factory.PizzaIngredientsFactory;
import patterns.factory.PizzaType;

public class CheesePizza extends Pizza {
    private PizzaIngredientsFactory ingredientsFactory;

    public void prepare() {
        setCheese(ingredientsFactory.createCheese());
        setDough(ingredientsFactory.createDough());
    }

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory, String name){
        super(name, PizzaType.CHEESE);
        this.ingredientsFactory = pizzaIngredientsFactory;
    }
}
