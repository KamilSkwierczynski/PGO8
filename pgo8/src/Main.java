public class Main {
    public static void main(String[] args) {
        Car nowyCar = new Car("Toyota", "xyz", 2000, 1000, 70);
        System.out.println("Efektywność paliwowa tego saomochodu to: " + nowyCar.calculateFuelEfficiency());

        Truck nowyTruck = new Truck("Volvo", "VNL", 2022, 2000, 100, 5);
        System.out.println("Efektywność paliwowa ciężarówki: " + nowyTruck.calculateFuelEfficiency());
}
