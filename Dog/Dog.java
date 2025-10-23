package Dog;

public class Dog {
   
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Display
    public void displayInfo() {
        System.out.print("Dog Name: " + name);
    System.out.print(" ");
        System.out.println("Breed: " + breed);
}
    }

