package Pet;

public class Bird extends Pet {
    double wingspan; // in centimeters

    Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
    }

    @Override
    double calculateHumanAge() {
        return age * 4.0; // Birds typically age slower
    }
}

