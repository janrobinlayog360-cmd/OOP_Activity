package Pet;

public class Dog extends Pet {
    String favoriteToy;

    Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    @Override
    double calculateHumanAge() {
        return age * 7.0; // Common conversion for dogs
    }
}
