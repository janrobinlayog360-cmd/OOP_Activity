package Event;

public class MusicalPerformance extends Event {
    String[] performers;

    MusicalPerformance(String eventName, String date, String location, String[] performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.print("Performers: ");
        for (int i = 0; i < performers.length; i++) {
            System.out.print(performers[i]);
            if (i < performers.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
