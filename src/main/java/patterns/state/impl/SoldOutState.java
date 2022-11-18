package patterns.state.impl;

import patterns.state.State;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void injectQuarter() {
        System.out.println("Out of gumballs!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Invalid operation!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Invalid operation!");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("Out of gumballs!");
    }
}
