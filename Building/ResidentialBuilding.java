package Building;

public class ResidentialBuilding extends Building {
    int numberOfApartments;
    double rentPerApartment;

    ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: ₱" + rentPerApartment);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}
