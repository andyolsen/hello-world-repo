package osl.simplelibrary;

public class CD extends LibraryItem {
    public CD(String title) {
        super(title);
    }

    @Override
    public int getFloor() {
        return 2;
    }
}
