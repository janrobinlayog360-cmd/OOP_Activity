package Event;

public class Seminar extends Event {
    int numberOfSpeakers;

    Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}
