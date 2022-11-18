package patterns.state.impl;

import patterns.state.State;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void injectQuarter() {
        System.out.println("You can't inject a quarter. Please wait for your gumball to be dispensed!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter at this stage!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You can't turn crank again. Please wait for the dispense to happen!");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();
        if(gumballMachine.getGumballsCount() > 0) {
            System.out.println("Dispensing a gumball!");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Gumball machine out of gumballs. Please visit next time!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
