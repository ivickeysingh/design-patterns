package patterns.strategy.impl;

import patterns.strategy.QuackBehaviour;

public class SimpleQuackBehaviour implements QuackBehaviour {
    public void quack() {
        System.out.println("I can quack");
    }
}
