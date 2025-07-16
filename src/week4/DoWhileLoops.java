package week4;

import java.util.Scanner;

public class DoWhileLoops {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// largestNumberOf5();
		// squares();
		doWhilecontinue();
	}

	private static void largestNumberOf5() {

		int count = 5;
		int largest = 0;
		do {
			System.out.print("Enter a number : ");
			int number = sc.nextInt();
			count--;
			if (number > largest) {
				largest = number;
			}
		} while (count != 0);
		System.out.println("Largest is " + largest);
	}

	private static void squares() {
		int sum = 0;
		int count = 5;
		do {

			int number = sc.nextInt();

			sum += Math.pow(number, 2);
			count--;

		} while (count != 0);
		System.out.println("Total is " + sum);
	}

	private static void doWhilecontinue() {
		int number = 1;
		do {
			if (number == 7) {
				number++;
				continue;
			}
			System.out.println(number);
			number++;

		} while (number != 11);
	}
}