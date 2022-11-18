package patterns.strategy.impl;

import patterns.strategy.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly");
    }
}
