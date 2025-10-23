package CustomerOrder;

public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("ORD001", "Kim Emdro", "2025-10-23", "New Bataan City", "TRK12345");

        order.showOrderDetails();

        System.out.println("\nUpdating status...");
        order.updateTrackingStatus("Shipped");
        order.updateTrackingStatus("Out for Delivery");
        order.updateTrackingStatus("Delivered");

        System.out.println("\nFinal Order Details:");
        order.showOrderDetails();
    }
}

