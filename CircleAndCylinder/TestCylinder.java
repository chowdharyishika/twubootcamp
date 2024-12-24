package CircleAndCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        // Test default Cylinder
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1); // Default Cylinder
        System.out.println("Base area: " + cylinder1.getBase().getArea());
        System.out.println("Volume: " + cylinder1.getVolume());

        // Test Cylinder with specified values
        Cylinder cylinder2 = new Cylinder(2.0, "blue", 5.0);
        System.out.println(cylinder2); // Custom Cylinder
        System.out.println("Base area: " + cylinder2.getBase().getArea());
        System.out.println("Volume: " + cylinder2.getVolume());

        // Modify cylinder2
        cylinder2.setHeight(10.0);
        cylinder2.getBase().setRadius(3.0);
        cylinder2.getBase().setColor("green");
        System.out.println("Modified Cylinder: " + cylinder2);
        System.out.println("Base area: " + cylinder2.getBase().getArea());
        System.out.println("Volume: " + cylinder2.getVolume());
    }
}