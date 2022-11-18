package patterns.state.impl;

import patterns.state.State;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State soldState;
    private State state;
    private int gumballsCount = 0;

    public GumballMachine(final int gumballsCount) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        if(gumballsCount > 0){
            this.gumballsCount = gumballsCount;
            state = noQuarterState;
        }else if(gumballsCount == 0){
            state = soldOutState;
        }else{
            throw new RuntimeException("Gumballs count cannot be in negative!");
        }
    }

    public void injectQuarter() {
        state.injectQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public boolean turnCrank() {
        if(state.turnCrank()){
            state.dispense();
            return true;
        }else {
            return false;
        }
    }

    public boolean releaseGumball() {
        if(gumballsCount > 0){
            gumballsCount--;
            return true;
        }else{
            return false;
        }
    }

    public int getGumballsCount() {
        return gumballsCount;
    }

    public void setGumballsCount(int gumballsCount) {
        this.gumballsCount = gumballsCount;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "GumballMachine 2020 Model" + "\nInventory: " + gumballsCount;
    }
}
