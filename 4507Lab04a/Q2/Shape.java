import java.util.Scanner;

public abstract class Shape {
    private String name;
    private Point topLeft;

    public Shape() {

    }

    public Shape(String name, Point topLeft) {
        this.name = name;
        this.topLeft = topLeft;
    }

    public abstract double getArea();
    public abstract Shape createShape(Scanner sc);

    @Override
    public String toString() {
        return name + ": " + topLeft;
    }
}
