package patterns.strategy;

public class Duck {
    private String name;
    private String color;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(final String name,
                final String color,
                final FlyBehaviour flyBehaviour,
                final QuackBehaviour quackBehaviour){
        this.name = name;
        this.color = color;
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public String getName(){
        return name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public void setFlyBehaviour(final FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public FlyBehaviour getFlyBehaviour(){
        return flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour(){
        return quackBehaviour;
    }

    public void setQuackBehaviour(final QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }

    public static DuckBuilder builder(){
        return new DuckBuilder();
    }

    public static class DuckBuilder{
        private  String name;
        private String color;
        private FlyBehaviour flyBehaviour;
        private QuackBehaviour quackBehaviour;

        public DuckBuilder name(final String duckName){
            this.name = duckName;
            return this;
        }

        public DuckBuilder color(final String duckColor){
            this.color = duckColor;
            return this;
        }

        public DuckBuilder flyBehaviour(final FlyBehaviour duckFlyBehaviour){
            this.flyBehaviour = duckFlyBehaviour;
            return this;
        }

        public DuckBuilder quackBehaviour(final QuackBehaviour duckQuackBehaviour){
            this.quackBehaviour =  duckQuackBehaviour;
            return this;
        }

        public Duck build(){
            return new Duck(name, color, flyBehaviour, quackBehaviour);
        }
    }
}
