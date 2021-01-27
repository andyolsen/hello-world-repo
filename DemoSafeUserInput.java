package solution.opflow;

import java.util.Scanner;

public class DemoSafeUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day   = getIntSafely(scanner, "Enter day: ", 1, 31);
        int month = getIntSafely(scanner, "Enter month: ", 1, 12);
        int year  = getIntSafely(scanner, "Enter year: ", -3000, +3000);
    }

    private static int getIntSafely(Scanner scanner, String message) {
        do {
            System.out.print(message);
            String userInput = scanner.next();
            try {
                int number = Integer.parseInt(userInput);
                return number;
            } catch (NumberFormatException ex) {
                //System.err.println("Not a number!");
            }
        }
        while (true);
    }

    private static int getIntSafely(Scanner scanner, String message, int min, int max) {
        do {
            System.out.print(message);
            String userInput = scanner.next();
            try {
                int number = Integer.parseInt(userInput);
                if (number >= min && number <= max) {
                    return number;
                }
            } catch (NumberFormatException ex) {
                //System.err.println("Not a number!");
            }
        }
        while (true);
    }
}
