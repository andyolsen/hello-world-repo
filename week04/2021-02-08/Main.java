package osl.simplelibrary;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Can't do this, becuase LibraryItem is abstract.
        //  LibraryItem item1 = new LibraryItem("Chopra's Baby Elephant");
        //  System.out.println(item1.toString());

        // A superclass variable can point to that type, OR ANY SUBCLASS.
        // This is called the Liskov Subtitution Principle.
        LibraryItem item1 = new Book("La chauve souri", "Jo Nesbo", "Policier");
        LibraryItem item2 = new Film("Mission Impossible 7", "Tom Cruise", 120);
        LibraryItem item3 = new CD("Some music");

        processAnyKindOfLibraryItem(item1);
        processAnyKindOfLibraryItem(item2);
        processAnyKindOfLibraryItem(item3);

        // Polymorphic collection.
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book("Millennium 2", "Steig Larsson", "Thriller"));
        items.add(new Film("Star Wars 207", "George Lucas", 600));
        items.add(new CD("Thriller"));
        items.add(new Book("Millennium 3", "Steig Larsson", "Thriller"));
        items.add(new Book("Millennium 1", "Steig Larsson", "Thriller"));

        // Loop through polymorphic collection.
        int bookCount = 0;
        for (LibraryItem i : items) {
            // It calls the "correct" version of toString().
            System.out.println(i.toString());
            if (i instanceof Book) {
                bookCount++;
            }
        }
        System.out.printf("The collection has %s books\n", bookCount);
    }

    // At compile-time, all we know is that item will be "some kind" of LibraryItem.
    private static void processAnyKindOfLibraryItem(LibraryItem item) {

        // At run-time, it looks at the actual object you've passed in THIS TIME.
        int f = item.getFloor();
        System.out.printf("The item is on floor %d\n", f);

        // If you really (REALLY!!!!) need to, you can "downcast".
        if (item instanceof Book) {
            Book b = (Book)item;
            System.out.println(b.isHardBack());
        }
    }
}
