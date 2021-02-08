package osl.simplelibrary;

public class Film extends LibraryItem {

    private String director;
    private int length;

    public Film(String title, String director, int length) {
        super(title);
        this.director = director;
        this.length = length;
    }

    @Override
    public int getFloor() {
        return 2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", director='").append(director).append('\'');
        sb.append(", length=").append(length);
        return sb.toString();
    }
}
