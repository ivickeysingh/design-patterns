package patterns.factory;

public abstract class PizzaStore {

    public void order(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(PizzaType pizzaType);
}
