package AuthorAndBookComposition;

public class Book {
    private String name;
    private Author author; // Composition: Book "has" an Author
    private double price;
    private int qty = 0; // Default value

    // Constructor with name, author, price
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor with name, author, price, qty
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for author
    public Author getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // toString method
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}