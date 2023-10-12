import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point createPoint(Scanner sc){
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "topLeft [" + x + ", " + y + ']';
    }
}