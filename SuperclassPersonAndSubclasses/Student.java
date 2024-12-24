package SuperclassPersonAndSubclasses;
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Constructor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getter for program
    public String getProgram() {
        return program;
    }

    // Setter for program
    public void setProgram(String program) {
        this.program = program;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for fee
    public double getFee() {
        return fee;
    }

    // Setter for fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}