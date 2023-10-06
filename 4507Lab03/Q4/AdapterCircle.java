public class AdapterCircle extends Square{
    private int side;

    public AdapterCircle(Circle c) {
        this.side = c.getRadius() / 2;
    }

    public double getSquareArea() {
        return side * side * Math.PI;
    }

    public String toString() {
        return "side=" + side + ", area= " + getSquareArea();
    }
}
