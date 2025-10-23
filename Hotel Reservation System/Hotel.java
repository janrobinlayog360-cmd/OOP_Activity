package Hotel Reservation System;

public class Hotel {
    private String hotelName;
    private int totalRooms;
    private int bookedRooms;

    public Hotel(String hotelName, int totalRooms) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.bookedRooms = 0;
    }

    public boolean bookRoom() {
        if (bookedRooms < totalRooms) {
            bookedRooms++;
            System.out.println("Room booked successfully!");
            return true;
        } else {
            System.out.println("Sorry, no available rooms!");
            return false;
        }
    }

    public boolean cancelBooking() {
        if (bookedRooms > 0) {
            bookedRooms--;
            System.out.println("Booking cancelled successfully!");
            return true;
        } else {
            System.out.println("No bookings to cancel!");
            return false;
        }
    }

    public void displayStatus() {
        System.out.println("Hotel: " + hotelName);
        System.out.println("Booked Rooms: " + bookedRooms + "/" + totalRooms);
    }
}
