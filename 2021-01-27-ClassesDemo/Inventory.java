package no.dnb.bibliotek;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book aBook)
    {
        books.add(aBook);
    }

    public int getNumberOfBookTitles() {
        return books.size();
    }

    public boolean containsBook(String titleToSearchFor) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(titleToSearchFor)) {
                return true;
            }
        }
        return false;
    }
}
