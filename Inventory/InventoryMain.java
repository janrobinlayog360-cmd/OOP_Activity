package Inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("iphone16", 5);
        Product p2 = new Product("iphone15", 15);
        Product p3 = new Product("iphone14", 3);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayProducts();

        inventory.checkLowInventory(10);
    }
}
