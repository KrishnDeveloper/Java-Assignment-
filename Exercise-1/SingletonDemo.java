class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null) instance=new Singleton();
        return instance;
    }
    public void show(){ System.out.println("Singleton instance"); }
}

public class SingletonDemo {
    public static void main(String[] args){
        Singleton s = Singleton.getInstance();
        s.show();
    }
}
