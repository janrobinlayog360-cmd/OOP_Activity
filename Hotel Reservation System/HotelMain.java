package Hotel Reservation System;

public class HotelMain {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sunrise Suites", 5);

        hotel.bookRoom();
        hotel.bookRoom();
        hotel.bookRoom();
        hotel.displayStatus();

        hotel.cancelBooking();
        hotel.displayStatus();
    }
}
