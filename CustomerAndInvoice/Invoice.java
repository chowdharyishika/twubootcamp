package CustomerAndInvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    // Constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Get customer's ID
    public int getCustomerId() {
        return customer.getId();
    }

    // Get customer's name
    public String getCustomerName() {
        return customer.getName();
    }

    // Get customer's discount
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Get amount after discount
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    // toString method
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
}