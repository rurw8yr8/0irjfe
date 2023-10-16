import java.util.Scanner;

public class Rectangle extends Shape {
    private int width;
    private int height;
    private Point point = new Point();

    public Rectangle(int width, int height, Point topLeft) {
        super("Rectangle", topLeft);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public Shape createShape(Scanner sc){
        point = point.createPoint(sc);
        System.out.println("Enter width:");
        int width = sc.nextInt();
        System.out.println("Enter height:");
        int height = sc.nextInt();
        return new Rectangle(width, height, point);
    }

    @Override
    public String toString() {
        return super.toString() + ", Width=" + width + ", height=" + height + ", Area = "+getArea();
    }

}
