package de.dhbw.mannheim.advanced_programming.e_abstract_classes;

public abstract class aShape {

    public final String value;

    protected aShape() {
        value = "a";
    }

    void getHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        aShape shape1 = (aShape) circle;

        System.out.println(circle == shape1);
        System.out.println(shape1.getClass());
        circle.getPi();
        //shape1.getPi();

        if (shape1 instanceof Circle) {
            Circle circle1 = (Circle) shape1;
            circle1.getPi();
            System.out.println("Shape is a circle");
        }

    }

    abstract double getArea();

    abstract double getDiameter();

    abstract double getCircumfence();
}

class Circle extends aShape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 0;
    }

    double getDiameter() {
        return 2*radius;
    }

    double getCircumfence() {
        return 0;
    }

    double getPi() {
        return 3.1415;
    }
}

class Square extends aShape {

    private final int a;


    public Square(int a) {
        this.a = a;
    }

    double getArea() {
        return a*a;
    }

    double getDiameter() {
        return a;
    }

    double getDiameter(boolean diagonal) {
        return a;
    }

    double getCircumfence() {
        return 2*a;
    }
}
