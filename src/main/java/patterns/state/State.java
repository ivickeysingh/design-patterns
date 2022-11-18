package patterns.state;

public interface State {
    void injectQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
}
