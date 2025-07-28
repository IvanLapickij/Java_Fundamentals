package week4;

import java.util.Scanner;

public class ForLoops {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// forHeaderTesting();
		// forSmallestLargest();
		// forHistogram();
		// forAverage();
		// forSequence();
		// forSumEvenNumbers();
		twelveDaysOfChristmas();
	}

	private static void forHeaderTesting() {

		// A
//		int sum = 0;
//		for(int i=0;;i++) {
//			
//			System.out.print("Enter a number (-1 to end) --> ");
//			int userInput= sc.nextInt();
//			if(userInput==-1) {
//				System.out.println("Sum is " + sum);
//				break;
//			}else {
//				sum+=userInput;
//				i++;
//			}
//		}

//		// B
//		int j =1;
//		int sum =0;
//		final int NUM_INPUTS = 3;
//		for(; j<=NUM_INPUTS; j++) {
//			
//			System.out.print("Enter a number (-1 to end) --> ");
//			int userInput= sc.nextInt();
//			
//			if(userInput==-1) {
//				System.out.println("Sum is " + sum);
//				break;
//			}else {
//				sum+=userInput;
//			}
//		}System.out.println("Sum is " + sum);
//	}

//		// C
//		int sum = 0;
//		final int NUM_INPUTS = 3;
//		for (int k=1; k<= NUM_INPUTS;) {
//
//			System.out.print("Enter a number (-1 to end) --> ");
//			int userInput = sc.nextInt();
//
//			if (userInput == -1) {
//				System.out.println("Sum is " + sum);
//				break;
//			} else {
//				sum += userInput;
//				k++;
//			}
//		}
//		System.out.println("Sum is " + sum);
//	}

		// D
		int sum = 0;
		int i = 0;
		final int NUM_INPUTS = 3;
		for (;;) {

			System.out.print("Enter a number (-1 to end) --> ");
			int userInput = sc.nextInt();

			if (i == NUM_INPUTS) {
				System.out.println("Sum is " + sum);

			} else {
				if (userInput == -1) {
					System.out.println("Sum is " + sum);
					break;
				} else {
					sum += userInput;
					i++;
				}
			}

		}
	}

	private static void forSmallestLargest() {

		int largest = 0;
		int smallest = 0;

		System.out.print("Enter n --> ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("n was invalid: " + n);
		} else {
			for (int i = 0; i < n; i++) {

				System.out.print("Enter a number --> ");
				int number = sc.nextInt();
				if (largest == 0 && smallest == 0) {
					largest = number;
					smallest = number;
				}

				if (number > largest) {
					largest = number;
				}

				if (number < smallest) {
					smallest = number;
				}
			}
		}

		if (n >= 0) {
			System.out.println("The smallest number entered is: " + smallest);
			System.out.println("The largest number entered is: " + largest);
		}

	}

	private static void forHistogram() {

		int rows = 0;
		int columns = 0;
		char character = 'C';

		System.out.print("Enter number of rows --> ");
		rows = sc.nextInt();

		System.out.print("Enter number of columns --> ");
		columns = sc.nextInt();

		System.out.print("Enter the character to use --> ");
		character = sc.next().charAt(0);

		for (int i = 0; i < rows; i++) {
			System.out.println();
			for (int y = 0; y < columns; y++) {
				System.out.print(character);

			}
		}
	}

	private static void forAverage() {
		double sum = 0;
		System.out.println("How many values --> ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a value --> ");
			int value = sc.nextInt();
			sum += value;
		}
		System.out.println("The average is " + sum / n);
	}

	private static void forSequence() {
		String sum = "";
		System.out.println("How many values --> ");// 10
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a value --> ");
			int value = sc.nextInt();
			if (n - i == 1) {
				sum += value;
			} else {
				sum += value + ", ";
			}

		}
		System.out.println(sum);
	}

	private static void forSumEvenNumbers() {
		int sum = 0;
		System.out.print("From --> ");
		int f = sc.nextInt();

		System.out.print("To --> ");
		int t = sc.nextInt();
		if (f % 2 == 0 && t % 2 == 0) {
			f += 1;
			for (; f < t; f++) {
				if (f % 2 == 0) {
					System.out.println(f);
					sum += f;
				}
			}
			System.out.println("The total is " + sum);
		} else {
			System.out.println("Odd input: " + f + "; " + t);
			System.out.println("The total is " + sum);
		}
	}

	private static void twelveDaysOfChristmas() {
		int daysOfChristmas = 12;
		String currentDayOfChristmas = "none";
		String songStart = ("On the " + currentDayOfChristmas + " day of Christmas,\r\n" + "My true love sent to me:"
				+ "");
		String songContinues = "";

		String firstDayGifts = "	A partridge in a pear tree.\n";
		String secondDayGifts = "	Two turtle doves, and\n";
		String thirddDayGifts = "	Three French hens,\n";

		String songContinue = ("");

		for (int i = 1; i <= daysOfChristmas; i++) {
			switch (i) {
			case 1:
				currentDayOfChristmas = "first";
				songContinues += firstDayGifts;
				System.out.println(songStart);
				System.out.println(songContinues);
				break;
			case 2:
				currentDayOfChristmas = "second";

				songContinues = secondDayGifts + firstDayGifts;
				System.out.println(songStart);
				System.out.println(songContinues);
				break;
			case 3:
				currentDayOfChristmas = "third";

				songContinues =thirddDayGifts+ secondDayGifts + firstDayGifts;
				System.out.println(songStart);
				System.out.println(songContinues);
				break;
			}
			
		}
		// System.out.println(song);
	}
}
