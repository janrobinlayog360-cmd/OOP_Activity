package Flight Reservation System;

public class FlightMain {
    public static void main(String[] args) {
        Flight flight = new Flight("PR123", "Tokyo", 3);

        flight.bookSeat();
        flight.bookSeat();
        flight.bookSeat();
        flight.bookSeat(); // too many
        flight.showStatus();

        flight.cancelSeat();
        flight.showStatus();
    }
}