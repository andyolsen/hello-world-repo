package com.osl.onlineretailer;

import java.util.Scanner;

public class ConsoleIO {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static String getLine(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
