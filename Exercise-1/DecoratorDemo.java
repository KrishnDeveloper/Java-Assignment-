interface Coffee {
    String getDescription();
    double cost();
}

class SimpleCoffee implements Coffee {
    public String getDescription(){ return "Simple Coffee"; }
    public double cost(){ return 5; }
}

class MilkDecorator implements Coffee {
    private Coffee c;
    MilkDecorator(Coffee c){ this.c=c; }
    public String getDescription(){ return c.getDescription()+", Milk"; }
    public double cost(){ return c.cost()+2; }
}

public class DecoratorDemo {
    public static void main(String[] args){
        Coffee c = new SimpleCoffee();
        System.out.println(c.getDescription()+" $"+c.cost());
        Coffee c2 = new MilkDecorator(c);
        System.out.println(c2.getDescription()+" $"+c2.cost());
    }
}
