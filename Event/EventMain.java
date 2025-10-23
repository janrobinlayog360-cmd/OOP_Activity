package Event;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("The Kim cute show 2025", "2025-11-15", "Compostela Convention Center", 5);
        String[] performers = {"The Midnight Notes", "DJ Sonic", "Echo Band"};
        MusicalPerformance concert = new MusicalPerformance("Handsome Festival", "2025-11-15", "New Bataan Convention Center", performers);

        System.out.println("=== Seminar Details ===");
        seminar.showDetails();

        System.out.println("\n=== Musical Performance Details ===");
        concert.showDetails();

        // Check if they have a schedule conflict
        System.out.println("\n=== Schedule Check ===");
        if (seminar.hasConflict(concert)) {
            System.out.println("⚠️ Conflict detected! Both events are scheduled at the same time and place.");
        } else {
            System.out.println("✅ No conflict. Events are scheduled properly.");
        }
    }
}
