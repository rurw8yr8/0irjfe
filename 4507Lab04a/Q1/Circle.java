import java.util.Scanner;

public class Circle extends Shape{
    private int radius;
    private Point point;

    public Circle(int radius, Point topLeft) {
        super("Circle", topLeft);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public Shape createShape(Scanner sc){
        point = point.createPoint(sc);
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        return new Circle(radius, point);
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius=" + radius + ", Area = "+getArea();
    }    
}
