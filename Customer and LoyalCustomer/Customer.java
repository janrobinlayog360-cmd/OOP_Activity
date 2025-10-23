package Customer and LoyalCustomer;

import java.util.ArrayList;

public class Customer {
    protected String name;
    protected String email;
    protected ArrayList<Double> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
        System.out.println(name + " purchased ₱" + amount);
    }

    public double getTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    public void displayInfo() {
        System.out.println("Customer: " + name + " | Email: " + email);
        System.out.println("Total Expenditure: ₱" + getTotalExpenditure());
    }
}
