package patterns.factory;

public enum PizzaType {
    CHEESE{
        public Pizza createPizza(PizzaTypeVisitor pizzaTypeVisitor, PizzaIngredientsFactory ingredientsFactory) {
            return pizzaTypeVisitor.createCheesePizza(ingredientsFactory);
        }
    },
    VEGGIE {
        public Pizza createPizza(PizzaTypeVisitor pizzaTypeVisitor, PizzaIngredientsFactory ingredientsFactory) {
            return pizzaTypeVisitor.createVeggiePizza(ingredientsFactory);
        }
    };

    public abstract Pizza createPizza(PizzaTypeVisitor pizzaTypeVisitor, PizzaIngredientsFactory ingredientsFactory);
}