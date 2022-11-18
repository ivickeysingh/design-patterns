package patterns.factory;

public interface PizzaTypeVisitor {
    Pizza createCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory);
    Pizza createVeggiePizza(PizzaIngredientsFactory pizzaIngredientsFactory);
}
