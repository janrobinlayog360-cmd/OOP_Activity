package Customer and LoyalCustomer;

public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer loyal = new LoyalCustomer("Kim Arniego", "kim@email.com", 10);

        loyal.addPurchase(5000);
        loyal.addPurchase(2500);

        loyal.displayInfo();
        double discounted = loyal.applyDiscount(1000);
        System.out.println("Amount after discount: ₱" + discounted);
    }
}
