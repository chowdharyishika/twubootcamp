package SuperclassPersonAndSubclasses;

public class Staff extends Person {
    private String school;
    private double pay;

    // Constructor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getter for school
    public String getSchool() {
        return school;
    }

    // Setter for school
    public void setSchool(String school) {
        this.school = school;
    }

    // Getter for pay
    public double getPay() {
        return pay;
    }

    // Setter for pay
    public void setPay(double pay) {
        this.pay = pay;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}