package Vehicle Inheritance (Car & Truck);

public class Car extends Vehicle {
    private int trunkSize; // in liters

    public Car(String make, String model, int year, int trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " liters");
    }
}
