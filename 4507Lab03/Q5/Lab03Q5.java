public class Lab03Q5 {
    public static void main(String[] args) {
        Car c1 = new Car("T90", 100);
        AmericanCar a1 = new AmericanCar("M1A2", 75);
        Car ac1 = new AdapterAmericanCar(a1);
        System.out.println(TestCarSpeed.compare(c1, ac1));
    }
}