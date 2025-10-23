package Customer and LoyalCustomer;

 public class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount(double amount) {
        double discounted = amount - (amount * discountRate / 100);
        System.out.println("Discount applied! New amount: ₱" + discounted);
        return discounted;
    }
}
