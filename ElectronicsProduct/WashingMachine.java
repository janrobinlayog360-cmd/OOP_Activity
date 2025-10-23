package ElectronicsProduct;

class WashingMachine extends ElectronicsProduct {
    int warrantyYears;

    WashingMachine(String productID, String name, double price, int warrantyYears) {
        super(productID, name, price);
        this.warrantyYears = warrantyYears;
    }

    // Extend warranty
    void extendWarranty(int extraYears) {
        if (extraYears > 0) {
            warrantyYears += extraYears;
            System.out.println("Warranty extended by " + extraYears + " years.");
        } else {
            System.out.println("Invalid number of years.");
        }
    }

    // Display all info
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}
