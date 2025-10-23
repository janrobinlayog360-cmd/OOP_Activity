package Flight Reservation System;

class Flight {
    String flightNumber;
    String destination;
    int capacity;
    int bookedSeats = 0;

    Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }

    void bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            System.out.println("Seat booked!");
        } else {
            System.out.println("No available seats!");
        }
    }

    void cancelSeat() {
        if (bookedSeats > 0) {
            bookedSeats--;
            System.out.println("Seat cancelled!");
        } else {
            System.out.println("No booked seats to cancel!");
        }
    }

    void showStatus() {
        System.out.println("\nFlight " + flightNumber + " to " + destination);
        System.out.println("Seats: " + bookedSeats + "/" + capacity);
    }
}


