package Reservation;

public class RailwayReservation extends Reservation {
    String seatNumber;

    RailwayReservation(String reservationID, String customerName, String date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }

    void changeSeat(String newSeat) {
        this.seatNumber = newSeat;
        System.out.println("Seat number updated to: " + newSeat);
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}
