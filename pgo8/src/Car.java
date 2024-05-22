import java.util.ArrayList;

public class Car {
    ArrayList<Vehicle> = new ArrayList<Vehicle>();
    private double milesDriven;
    private double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }
    @Override
    public double {
        return milesDriven/fuelConsumed;
    }
}
