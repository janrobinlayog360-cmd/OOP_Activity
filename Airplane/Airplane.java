package Airplane;

class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public void delayFlight() {
        delayed = true;
        System.out.println("Flight " + flightNumber + " is delayed.");
    }

    public void checkStatus() {
        System.out.println("Flight: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Status: " + (delayed ? "Delayed" : "On Time"));
    }
}
