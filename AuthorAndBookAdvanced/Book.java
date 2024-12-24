package AuthorAndBookAdvanced;
public class Book {
    private String name;
    private Author[] authors; // Array of authors
    private double price;
    private int qty = 0; // Default value

    // Constructor with name, authors, and price
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Constructor with name, authors, price, and quantity
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for authors
    public Author[] getAuthors() {
        return authors;
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

    // Get author names as a comma-separated string
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder authorsInfo = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsInfo.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsInfo.append(",");
            }
        }
        return "Book[name=" + name + ",authors={" + authorsInfo + "},price=" + price + ",qty=" + qty + "]";
    }
}