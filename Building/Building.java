package Building;

public class Building {
    String address;
    int numberOfFloors;
    double totalArea;

    Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    void showDetails() {
        System.out.println("\nAddress: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq.m");
    }
}