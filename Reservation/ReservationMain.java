package Reservation;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("R001", "Lebron James", "2025-11-10", 205);
        RailwayReservation train = new RailwayReservation("T123", "Kime Emdro", "2025-11-10", "A12");

        System.out.println("=== Resort Reservation ===");
        resort.showDetails();
        resort.checkStatus();
        resort.modifyReservation("2025-11-12");
        resort.assignRoom(210);
        resort.status = "Confirmed";

        System.out.println("\n=== Railway Reservation ===");
        train.showDetails();
        train.checkStatus();
        train.modifyReservation("2025-11-11");
        train.changeSeat("B7");
        train.status = "Confirmed";

        System.out.println("\n=== Updated Details ===");
        resort.showDetails();
        train.showDetails();
    }
}

