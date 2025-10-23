package Pet;

public class Pet {
    String name;
    String species;
    int age;

    Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("\nPet Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    double calculateHumanAge() {
        return age * 7.0; // Default multiplier
    }
}

