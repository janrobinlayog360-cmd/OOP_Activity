package TrafficLight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayStatus();

        light.changeColor("Green");
        light.displayStatus();

        System.out.println("Is it red? " + light.isRed());
        System.out.println("Is it green? " + light.isGreen());
    }
}