import java.util.*;

interface Observer {
    void update(String msg);
}

class SimpleObserver implements Observer {
    private String name;
    SimpleObserver(String n){ name=n; }
    public void update(String msg) {
        System.out.println(name+" got update: "+msg);
    }
}

class Subject {
    List<Observer> list = new ArrayList<>();
    void add(Observer o){ list.add(o); }
    void notifyAllObservers(String msg){
        for(Observer o: list) o.update(msg);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.add(new SimpleObserver("Obs1"));
        s.add(new SimpleObserver("Obs2"));
        s.notifyAllObservers("Hello");
    }
}
