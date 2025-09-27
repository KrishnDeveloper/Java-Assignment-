interface Strategy {
    int execute(int a, int b);
}

class Add implements Strategy {
    public int execute(int a, int b){ return a+b; }
}

class Multiply implements Strategy {
    public int execute(int a, int b){ return a*b; }
}

class Context {
    Strategy s;
    Context(Strategy s){ this.s=s; }
    int run(int a, int b){ return s.execute(a,b); }
}

public class StrategyDemo {
    public static void main(String[] args) {
        Context c1 = new Context(new Add());
        System.out.println("Add: "+c1.run(2,3));
        Context c2 = new Context(new Multiply());
        System.out.println("Multiply: "+c2.run(2,3));
    }
}
