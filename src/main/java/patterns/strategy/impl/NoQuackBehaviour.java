package patterns.strategy.impl;

import patterns.strategy.QuackBehaviour;

public class NoQuackBehaviour implements QuackBehaviour {
    public void quack() {
        System.out.println("I can't quack");
    }
}
