package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

class Restaurant {
    private HashMap<String, Double> menuItems;
    private ArrayList<Integer> ratings;

    // Constructor
    public Restaurant() {
        menuItems = new HashMap<>();
        ratings = new ArrayList<>();
    }

    // Add item to menu
    public void addItem(String item, double price) {
        menuItems.put(item, price);
        System.out.println(item + " added to menu at ₱" + price);
    }

    // Remove item from menu
    public void removeItem(String item) {
        if (menuItems.containsKey(item)) {
            menuItems.remove(item);
            System.out.println(item + " removed from menu.");
        } else {
            System.out.println(item + " not found in menu.");
        }
    }

    // Add rating (1–5)
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
            System.out.println("Rating added: " + rating);
        } else {
            System.out.println("Invalid rating. Must be between 1 and 5.");
        }
    }

    // Compute average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    // Display all menu items
    public void displayMenu() {
        System.out.println("\n--- Menu ---");
        if (menuItems.isEmpty()) {
            System.out.println("No items in menu.");
        } else {
            for (String item : menuItems.keySet()) {
                System.out.println(item + " - ₱" + menuItems.get(item));
            }
        }
    }
}

