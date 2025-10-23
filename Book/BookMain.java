package Book;
public class BookMain {
    public static void main(String[] args) {
        BookCollection library = new BookCollection();

        Book b1 = new Book("How to be a handsome", "Kim Arniego", "123456");
        Book b2 = new Book("Romance", "Jane Smith", "789101");

        library.addBook(b1);
        library.addBook(b2);
        library.displayBooks();

        library.removeBook(b1);
        library.displayBooks();
    }
}
