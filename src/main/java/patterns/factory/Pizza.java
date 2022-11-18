package patterns.factory;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    PizzaType type;

    public void bake(){
        System.out.println("Bake " + name + " of " + type.toString() + " type for 25 minutes at 350 C");
    }

    public void cut(){
        System.out.println("Cutting the pizza in diagonal slices");
    }

    public void box(){
        System.out.println("Place the pizza in the official pizza box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public Pizza(final String name, final PizzaType pizzaType){
        this.name = name;
        this.type = pizzaType;
    }

    public abstract void prepare();
}

