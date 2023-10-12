import java.util.Scanner;
import java.util.Vector;

public class Lab04Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> shapes = new Vector<Shape>();
        int command;
        boolean loop = true;

        while (loop) {
            System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
            command = sc.nextInt();

            switch (command) {
                case 0 -> loop = false;
                case 1 -> {
                    for (Shape shape : shapes)
                        ClientShape.doAction((shape));
                }

                case 2 -> {
                    Shape c = new Circle();
                    c = c.createShape(sc);
                    shapes.add(c);
                }

                case 3 -> {
                    Shape r = new Rectangle();
                    r = r.createShape(sc);
                    shapes.add(r);
                }
            }

        }

    }

}