package TrafficLight;

class TrafficLight {
    private String color;
    private int duration; // in seconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Light changed to " + color);
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    public void displayStatus() {
        System.out.println("Traffic Light: " + color + " (" + duration + " seconds)");
    }
}
