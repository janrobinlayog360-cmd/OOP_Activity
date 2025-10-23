package Inventory;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from inventory.");
    }

    public void checkLowInventory(int threshold) {
        System.out.println("\nLow Inventory Products (below " + threshold + "):");
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                System.out.println("- " + product);
            }
        }
    }

    public void displayProducts() {
        System.out.println("\nCurrent Inventory:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
    }
}
