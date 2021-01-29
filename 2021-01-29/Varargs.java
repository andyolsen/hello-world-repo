package demo.additionallanguagefeatures;

import java.awt.Color;

public class Varargs {

	public static void main(String[] args) {
		testVarargs();
		testMyVarargs();
	}

	private static void testVarargs() {
		// Calling a varargs method using an array.
		Object[] array = { "Andy", 43, 1.68 };
		System.out.printf("Hi %s, you are %d and your height is %sm.\n", array);

		// Calling a varargs method using a series of separate arguments.
		System.out.printf("Hi %s, you are %d and your height is %sm.\n", "Andy", 43, 1.68);
	}
	
	private static void testMyVarargs() {
		// Calling my varargs method using an array.
		Object[] array = { "Jayne", "Emily", "Thomas", "Swansea City", 3, Color.RED };
		myVarargsMethod("Andy", "Olsen", array);

		// Calling my varargs method using a series of separate arguments.
		myVarargsMethod("Andy", "Olsen", "Jayne", "Emily", "Thomas", "Wales", 3, Color.RED);

		double average = calculateAverage(3, 12, 19, 1, 2, 7, 5, 10, 26, 2, 22, 11, 186, 283, 310, 344, 31, 1, 1, 2);
		System.out.println("Average is " + average);
	}

	private static void myVarargsMethod(String firstName, String lastName, Object ... specialThings) {
		System.out.printf("\nHi %s %s, here are your special things:\n", firstName, lastName);
		for (Object obj: specialThings) {
			System.out.println(" -- " + obj.toString());
		}
	}

	private static double calculateAverage(int... numbers) {

		int sum = 0;

//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}

		// This is easier, using a foreach loop.
		for (int n: numbers) {
			sum += n;
		}

		// Casting...
		return (double)sum / numbers.length;
	}


}
