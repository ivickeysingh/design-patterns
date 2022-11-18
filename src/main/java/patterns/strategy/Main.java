package patterns.strategy;

import patterns.strategy.impl.NoFlyBehaviour;
import patterns.strategy.impl.NoQuackBehaviour;
import patterns.strategy.impl.SimpleFlyBehaviour;
import patterns.strategy.impl.SimpleQuackBehaviour;

public class Main {
    public static void main(String[] args) {
        Duck duck = Duck.builder()
                .color("chatak")
                .name("black")
                .flyBehaviour(new SimpleFlyBehaviour())
                .quackBehaviour(new SimpleQuackBehaviour())
                .build();
        duck.fly();
        duck.quack();
        duck.setFlyBehaviour(new NoFlyBehaviour());
        duck.fly();
        duck.setQuackBehaviour(new NoQuackBehaviour());
        duck.quack();
    }
}
