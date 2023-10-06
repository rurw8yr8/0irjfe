public class AdapterAmericanCar extends Car{
    private String name;
    private double maxSpeed; // in kilometers per hour

    public AdapterAmericanCar(AmericanCar a) {
        this.name = a.getName();
        this.maxSpeed = a.getSpeedInMile();
    }

    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed * 1.609;
    }

    public double compare(Car car) {
        return getMaxSpeed() - car.getMaxSpeed();
    }
}