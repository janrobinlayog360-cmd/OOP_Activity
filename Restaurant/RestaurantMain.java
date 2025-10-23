package Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Burger", 150);
        restaurant.addItem("Pasta", 220);
        restaurant.addItem("Iced Coffee", 90);

        restaurant.displayMenu();

        restaurant.addRating(5);
        restaurant.addRating(4);
        restaurant.addRating(3);

        System.out.println("\nAverage Rating: " + restaurant.getAverageRating());

        System.out.println("\nRemoving an item...");
        restaurant.removeItem("Iced Coffee");
        restaurant.displayMenu();
    }
}


