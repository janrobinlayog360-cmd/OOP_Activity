package Reservation;

public class Reservation {
    String reservationID;
    String customerName;
    String date;
    String status;

    Reservation(String reservationID, String customerName, String date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
        this.status = "Pending";
    }

    void checkStatus() {
        System.out.println("Reservation Status: " + status);
    }

    void modifyReservation(String newDate) {
        this.date = newDate;
        System.out.println("Reservation date updated to: " + newDate);
    }

    void showDetails() {
        System.out.println("\nReservation ID: " + reservationID);
        System.out.println("Customer: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
    }
}

