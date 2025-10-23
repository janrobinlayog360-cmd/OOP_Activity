package Reservation;

public class ResortReservation extends Reservation {
    int roomNumber;

    ResortReservation(String reservationID, String customerName, String date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }

    void assignRoom(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
        System.out.println("Room number updated to: " + newRoomNumber);
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

