package Shape (Abstract Class);

public class ShapeMain {
    public static void main(String[] args) {
        // Create objects of each shape
        Rectangle rect = new Rectangle(5, 3);
        Circle circ = new Circle(4);
        Triangle tri = new Triangle(3, 4, 5);

        // Display results
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());

        System.out.println("\nCircle Area: " + circ.getArea());
        System.out.println("Circle Perimeter: " + circ.getPerimeter());

        System.out.println("\nTriangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }
}

