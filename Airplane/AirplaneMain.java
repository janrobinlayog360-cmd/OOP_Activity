package Airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane flight = new Airplane("PR123", "Tokyo", "10:00 AM");
        flight.checkStatus();

        flight.delayFlight();
        flight.checkStatus();
    }
}
