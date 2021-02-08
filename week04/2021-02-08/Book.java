package osl.simplelibrary;

public class Book extends LibraryItem {

    private String author;
    private String genre;
    private boolean hardBack;

    public Book(String title, String author, String genre) {
        // Constructor chaining.
        this(title, author, genre, false);
    }

    public Book(String title, String author, String genre, boolean hardBack) {
        // First statement in a ctor, is always a call to the superclass ctor.
        super(title);
        this.author = author;
        this.genre = genre;
        this.hardBack = hardBack;
    }

    public boolean isHardBack() {
        return hardBack;
    }

    @Override
    public int getFloor() {
        return 1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", author='").append(author).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", hardback='").append(hardBack).append('\'');
        return sb.toString();
    }


}

/*
public class HardBackBook extends Book {

}
*/