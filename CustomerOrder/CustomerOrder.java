package CustomerOrder;

public class CustomerOrder {
    String orderID;
    String customerName;
    String orderDate;

    CustomerOrder(String orderID, String customerName, String orderDate) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderID);
        System.out.println("Customer: " + customerName);
        System.out.println("Order Date: " + orderDate);
    }
}
