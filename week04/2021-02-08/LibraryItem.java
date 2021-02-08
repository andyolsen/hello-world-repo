package osl.simplelibrary;

import java.util.UUID;

public abstract class LibraryItem extends Object {

    private String title;
    private UUID uuid;

    public LibraryItem(String title) {
        this.title = title;
        this.uuid = UUID.randomUUID();   // Factory method - a static method that creates/returns an instance.
    }

    // An abstract method:
    //  - it indicates all subclasses will implement this method.
    //  - but it doesn't provide a fallback.
    // In other words, "abstract method" means "must override".
    public abstract int getFloor();

    @Override
    public String toString() {
        // This is an example of "fluent" function calls.
        return new StringBuilder()
                .append("title='")
                .append(title)
                .append('\'')
                .append(", uuid=")
                .append(uuid)
                .toString();
    }
}


/*
class UUID {
    public static UUID randomUUID() {
        return new UUID(..........);
    }
}
*/