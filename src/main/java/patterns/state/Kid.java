package patterns.state;

import patterns.state.impl.GumballMachine;

public class Kid {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.injectQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);
    }
}
