package no.dnb.bibliotek;

public class Main {

    public static void main(String[] args) {

        Inventory theInventory = new Inventory();

        Book book1 = new Book("Millennium 2", "Steig Larsson", 2);
        theInventory.addBook(book1);

        Book book2 = new Book("Le Couteau", "Jo Nesboe", 5);
        theInventory.addBook(book2);

        int n = theInventory.getNumberOfBookTitles();
        System.out.println(n);

        boolean sr1 = theInventory.containsBook("Millennium 2");
        System.out.println(sr1);

        boolean sr2 = theInventory.containsBook("Swansea City - The Glory Years");
        System.out.println(sr2);


//        Book book1 = new Book("Millennium 2", "Steig Larsson", 2);
//        book1.borrowBook();
//        book1.borrowBook();
//        book1.borrowBook();
//        book1.returnBook();
//        System.out.println(book1.toString());   // toString(book1)
//
//        Book book2 = new Book("Le Couteau", "Jo Nesboe", 5);
//        System.out.println(book2.toString());
    }
}
