package patterns.factory;

public interface PizzaIngredientsFactory {
    public Dough createDough();
    public Cheese createCheese();
}
