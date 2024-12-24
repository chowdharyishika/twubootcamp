package CircleAndCylinder;

public class Cylinder {
    private Circle base; // Composition: Cylinder "has" a Circle
    private double height;

    // Constructor with default values
    public Cylinder() {
        this.base = new Circle(); // Default Circle
        this.height = 1.0;        // Default height
    }

    // Constructor with specified radius, color, and height
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color); // Create Circle with specified radius and color
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for base circle
    public Circle getBase() {
        return base;
    }

    // Method to calculate volume
    public double getVolume() {
        return base.getArea() * height;
    }

    // toString method
    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }
}