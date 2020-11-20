package kontruktory_05;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook(Book book) {
        this.books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = book;
    }
}
