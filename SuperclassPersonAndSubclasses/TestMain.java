package SuperclassPersonAndSubclasses;

public class TestMain {
    public static void main(String[] args) {
        // Test Person class
        Person p1 = new Person("John Doe", "123 Main St");
        System.out.println(p1);

        // Test Student class
        Student s1 = new Student("Alice", "456 Elm St", "Computer Science", 2024, 15000.0);
        System.out.println(s1);

        s1.setProgram("Data Science");
        s1.setYear(2025);
        s1.setFee(16000.0);
        System.out.println("Updated Student: " + s1);

        // Test Staff class
        Staff st1 = new Staff("Bob", "789 Oak St", "ABC School", 50000.0);
        System.out.println(st1);

        st1.setSchool("XYZ School");
        st1.setPay(55000.0);
        System.out.println("Updated Staff: " + st1);
    }
}