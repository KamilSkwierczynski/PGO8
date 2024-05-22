import java.util.ArrayList;

public class Truck {
    private ArrayList<Vehicle> = new ArrayList<Vehicle>();
    private double milesDriven;
    private double fuelConsumed;
    private double cargoWeight;
    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
