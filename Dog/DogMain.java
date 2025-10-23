package Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Bisaya");
        Dog dog2 = new Dog("Lebron", "The dog can't be moved:(");

        dog1.displayInfo();
        dog1.setName("Barklee");
        dog1.setBreed("Labrador");
        dog2.displayInfo();
    }
}
    

