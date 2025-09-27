interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw(){ System.out.println("Circle"); }
}

class Square implements Shape {
    public void draw(){ System.out.println("Square"); }
}

class ShapeFactory {
    public Shape getShape(String type){
        if(type.equals("circle")) return new Circle();
        if(type.equals("square")) return new Square();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args){
        ShapeFactory f = new ShapeFactory();
        Shape s1 = f.getShape("circle"); s1.draw();
        Shape s2 = f.getShape("square"); s2.draw();
    }
}
