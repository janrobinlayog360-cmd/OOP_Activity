package Book;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BookCollection {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added.");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.getTitle() + " removed.");
    }

    public void displayBooks() {
        System.out.println("\nBook Collection:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}