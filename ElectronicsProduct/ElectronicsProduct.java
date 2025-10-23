package ElectronicsProduct;

class ElectronicsProduct {
    String productID;
    String name;
    double price;

    ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Method to apply discount
    void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountAmount = price * (percent / 100);
            price -= discountAmount;
            System.out.println("Discount of " + percent + "% applied.");
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Display product info
    void showDetails() {
        System.out.println("\nProduct ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: ₱" + price);
    }
}
