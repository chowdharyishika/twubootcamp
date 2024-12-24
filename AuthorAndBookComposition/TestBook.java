package AuthorAndBookComposition;
public class TestBook {
    public static void main(String[] args) {
        // Construct an Author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        // Construct a Book instance
        Book dummyBook = new Book("Java for Dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook); // Test Book's toString()

        // Test getters and setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Using an anonymous Author instance
        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}