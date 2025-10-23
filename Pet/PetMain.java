package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Rubber Bone");
        Bird bird = new Bird("Kiwi", 2, 25.5);

        System.out.println("=== Dog Details ===");
        dog.displayDetails();
        System.out.println("Age in human years: " + dog.calculateHumanAge());

        System.out.println("\n=== Bird Details ===");
        bird.displayDetails();
        System.out.println("Age in human years: " + bird.calculateHumanAge());
    }
}
