package com.osl.onlineretailer;

public class Product {

    private String description;  // Starburst
    private double netPrice;  // 15.99  1599
    private int numberInStock = 0;

    private final int id;
    private final boolean perishable;
    private final int reorderThreshold;
    private final int reorderAmount;

    private static int nextId = 147;
    private final static int REORDER_PERCENTAGE = 10;
    private final static double SALES_TAX_PERCENTAGE = 25;

    public static double getSalesTaxPercentage() {
        return SALES_TAX_PERCENTAGE;
    }

    public Product(String description, double netPrice) {
        this(description, netPrice, 10, false);
    }

    public Product(String description, double netPrice, int reorderThreshold, boolean perishable) {
        this.id = nextId++;
        this.description = description;
        this.netPrice = netPrice;
        this.perishable = perishable;
        this.reorderThreshold = reorderThreshold;
        this.reorderAmount = reorderThreshold / REORDER_PERCENTAGE;
    }

    // initializer block.
    {
        System.out.println("DO SOME DATABASE WORK #1");
    }

    // initializer block # 2.
    {
        System.out.println("DO SOME DATABASE WORK #2");
    }

    public boolean isPerishable() {
        return perishable;
    }

    public String getDescription() {
        return description;
    }

    public void reorderIfLowStock() {
        if (numberInStock < reorderThreshold) {
            numberInStock += reorderAmount;
        }
    }

    public double getSalesTax() {
        return netPrice * SALES_TAX_PERCENTAGE / 100;
    }

    public double getGrossPrice() {
        return netPrice + getSalesTax();
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", description, netPrice, numberInStock);
    }
}
