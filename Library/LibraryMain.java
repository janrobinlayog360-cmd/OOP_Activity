package Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Java 101", "John Doe", "1111");
        Book b2 = new Book("OOP Concepts", "Jane Smith", "2222");

        library.addBook(b1);
        library.addBook(b2);
        library.displayBooks();

        System.out.println("\nRemoving one book...");
        library.removeBook(b1);
        library.displayBooks();
    }
}

