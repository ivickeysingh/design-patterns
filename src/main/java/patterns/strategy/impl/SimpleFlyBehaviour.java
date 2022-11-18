package patterns.strategy.impl;

import patterns.strategy.FlyBehaviour;

public class SimpleFlyBehaviour implements FlyBehaviour {
    public void fly() {
        System.out.println("I can fly");
    }
}
