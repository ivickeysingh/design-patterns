package patterns.factory.impl;

import patterns.factory.Pizza;
import patterns.factory.PizzaIngredientsFactory;
import patterns.factory.PizzaTypeVisitor;

public class ChicagoPizzaVisitor implements PizzaTypeVisitor {
    public Pizza createCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        return new CheesePizza(pizzaIngredientsFactory, "ChicagoCheesePizza");
    }

    public Pizza createVeggiePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        return new VeggiePizza(pizzaIngredientsFactory, "VeggieCheesePizza");
    }
}
