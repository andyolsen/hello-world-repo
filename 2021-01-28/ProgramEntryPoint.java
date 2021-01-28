package com.osl.onlineretailer;

public class ProgramEntryPoint {

    // Client code.
    public static void main(String[] args) {

        Product p1 = new Product("Millennium 2", 8.00);
        Product p2 = new Product("Latte", 2.50, 1000, true);

        // To call an instance method, use the syntax object.method();
        p1.getGrossPrice();
        System.out.println(p1.getSalesTax());
        System.out.println(p1.getGrossPrice());

        p1.reorderIfLowStock();
        System.out.println(p1);

        // To call a static method, use the syntax Classname.method();
        int wholeNum1 = ConsoleIO.getInt("Gimme an int");
        double fractionalNum1 = ConsoleIO.getDouble("Gimme a fraction baby");

    }
}
