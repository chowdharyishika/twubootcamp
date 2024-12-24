package AuthorAndBookAdvanced;

public class TestBook {
    public static void main(String[] args) {
        // Create an array of authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'm');

        // Create a book instance with multiple authors
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // Test toString()

        // Test getters
        System.out.println("Book name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());
        System.out.println("Authors: " + javaDummy.getAuthorNames());

        // Test setters
        javaDummy.setPrice(29.99);
        javaDummy.setQty(50);
        System.out.println("Updated Price: " + javaDummy.getPrice());
        System.out.println("Updated Quantity: " + javaDummy.getQty());
        System.out.println("Updated Book: " + javaDummy);
    }
}