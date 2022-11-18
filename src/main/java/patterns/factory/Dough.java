package patterns.factory;

public abstract class Dough {
    DoughType doughType;

    public Dough(DoughType doughType){
        this.doughType = doughType;
    }
}
