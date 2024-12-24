package CustomerAndInvoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for discount
    public int getDiscount() {
        return discount;
    }

    // Setter for discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString method
    @Override
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}