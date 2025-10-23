package CustomerOrder;

public class OnlineOrder extends CustomerOrder {
    String deliveryAddress;
    String trackingNumber;
    String trackingStatus;

    OnlineOrder(String orderID, String customerName, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customerName, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing";
    }

    int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("manila")) {
            return 2;
        } else if (deliveryAddress.toLowerCase().contains("cebu")) {
            return 3;
        } else if (deliveryAddress.toLowerCase().contains("davao")) {
            return 4;
        } else {
            return 5;
        }
    }

    void updateTrackingStatus(String newStatus) {
        trackingStatus = newStatus;
        System.out.println("Tracking status updated to: " + trackingStatus);
    }

    @Override
    void showOrderDetails() {
        super.showOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}
