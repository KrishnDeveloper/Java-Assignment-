class OldPrinter {
    void printOld(String msg){ System.out.println("Old: "+msg); }
}

interface NewPrinter {
    void print(String msg);
}

class Adapter implements NewPrinter {
    OldPrinter old = new OldPrinter();
    public void print(String msg){ old.printOld(msg); }
}

public class AdapterDemo {
    public static void main(String[] args){
        NewPrinter p = new Adapter();
        p.print("Hello");
    }
}
