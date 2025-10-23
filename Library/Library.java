package Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book + " removed from the library.");
    }

    public void displayBooks() {
        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}

