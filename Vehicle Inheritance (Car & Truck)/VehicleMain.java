package Vehicle Inheritance (Car & Truck);

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 500);
        Truck truck = new Truck("Isuzu", "D-Max", 2021, 3.5);

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
    }
}

