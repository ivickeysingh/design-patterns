package patterns.factory;

import patterns.factory.impl.NYPizzaStore;

public class PizzaCustomer {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.order(PizzaType.CHEESE);
        pizzaStore.order(PizzaType.VEGGIE);
        String s = "av";
        System.out.println(s.substring(2,2) + "adf");
    }
}
