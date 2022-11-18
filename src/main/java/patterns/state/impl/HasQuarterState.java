package patterns.state.impl;

import patterns.state.State;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

    public HasQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void injectQuarter() {
        System.out.println("You already have injected a quarter. Please wait!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting quarter!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("Please turn the crank to get a gumball!");
    }
}
