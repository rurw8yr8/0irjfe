public class Lab03Q4 {
    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        Square sc1 = new AdapterCircle(c1);
        ShowSquareInfo.printSquare(sc1);
    }
}
