package patterns.state.impl;

import patterns.state.State;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void injectQuarter() {
        System.out.println("You injected a quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please inject a quarter to eject it!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You can't turn the crank. Insert a quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You can't get a gumball. Insert a quarter to get one!");
    }
}
