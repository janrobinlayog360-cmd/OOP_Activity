package Vehicle Inheritance (Car & Truck);

public class Truck {
 public class Truck extends Vehicle {
    private double payloadCapacity; // in tons

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}
   
}
