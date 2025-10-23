package Event;

public class Event {
    String eventName;
    String date;
    String location;

    Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    void showDetails() {
        System.out.println("\nEvent Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    // Check if two events have the same date and location
    boolean hasConflict(Event other) {
        return this.date.equals(other.date) && this.location.equals(other.location);
    }
}

