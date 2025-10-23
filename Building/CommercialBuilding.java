package Building;

public class CommercialBuilding extends Building {
    double officeSpace; // in square meters
    double rentPerSqM;

    CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSqM) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqM = rentPerSqM;
    }

    double calculateTotalRent() {
        return officeSpace * rentPerSqM;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Office Space: " + officeSpace + " sq.m");
        System.out.println("Rent per sq.m: ₱" + rentPerSqM);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}
