package patterns.factory.impl;

import patterns.factory.*;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientsFactory pizzaIngredientsFactory;
    PizzaTypeVisitor pizzaTypeVisitor;

    public NYPizzaStore(){
        this.pizzaIngredientsFactory = new NYPizzaIngredientsFactory();
        this.pizzaTypeVisitor = new NYPizzaVisitor();

    }

    public Pizza createPizza(PizzaType pizzaType) {
        return pizzaType.createPizza(pizzaTypeVisitor, pizzaIngredientsFactory);
    }
}
