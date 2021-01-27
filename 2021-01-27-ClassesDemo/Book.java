package no.dnb.bibliotek;

public class Book {

    // Instance (object) variables.
    private String title;           // null
    private String author;          // null
    private int copiesInStock;

    // No-arg constructor (initialization function), to do "proper" initialization...
    public Book(String t, String a, int c) {
        System.out.println("Book constructor called!");
        title = t;
        author = a;
        copiesInStock = c;
    }

    // Getters and setters.
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // Instance methods.
    public boolean borrowBook() {
        if (copiesInStock > 0) {
            copiesInStock--;
            return true;
        }
        else {
            return false;
        }
    }

    public void returnBook() {
        copiesInStock++;
    }

    public String toString() {
        return String.format("%s, written by %s, copies in stock: %d", title, author, copiesInStock);
    }
}

