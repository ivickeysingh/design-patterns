package patterns.factory;

public abstract class Cheese {
    CheeseType type;

    public Cheese(CheeseType cheeseType){
        type = cheeseType;
    }
}
