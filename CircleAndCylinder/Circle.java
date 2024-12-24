package CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    // Constructor with default values
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with specified radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}