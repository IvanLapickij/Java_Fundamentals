package week4;

import java.util.Scanner;

public class WhileLoops {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// thirdOrderPolynomial();
		// whileAverage();
		// whileGrades();
		//whileHistogram();
		whileLargestSmallest();
	}

	private static void thirdOrderPolynomial() {

		double a, b, c, d, x, fx, sum;

		System.out.print("Enter coefficient a: ");
		a = sc.nextDouble();

		System.out.print("Enter coefficient b: ");
		b = sc.nextDouble();

		System.out.print("Enter coefficient c: ");
		c = sc.nextDouble();

		System.out.print("Enter coefficient d: ");
		d = sc.nextDouble();

		char prompt = 'y';
		boolean gates = true;

		while (gates) {
			if (prompt == 'n') {
				gates = false;
				System.out.println("End of loop, 'n' entered");
			} else if (prompt == 'y') {
				System.out.println("Enter the value of x: ");
				x = sc.nextDouble();
				System.out.println();
				fx = a * x * 3 + b * x * 2 + c * x + d;
				System.out.println("The value of polynomial at " + x + " is " + fx);
				System.out.println();

				System.out.println("Do you wish t o continue (y/n) -->");
				prompt = sc.next().charAt(0);
			} else {

				System.out.println("You entered " + prompt);
				prompt = 'y';
				System.out.println("Please enter 'y' or 'n' only");
				System.out.println("Do you wish t o continue (y/n) -->");
				prompt = sc.next().charAt(0);
			}
		}

	}

	private static void whileAverage() {

		int times;
		int number;
		int sum = 0;
		double average;
		System.out.println("How many numbers in the sequence ->> ");
		times = sc.nextInt();
		int count = times;
		while (count != 0) {

			System.out.println("Please enter a number --> ");
			number = sc.nextInt();

			sum += number;
			count--;
		}
		average = sum / times;
		System.out.println("Average is " + average);
	}

	private static void whileGrades() {

		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

		String grade;

		while (true) {

			// as for user input & convert to lowercase
			System.out.println("Enter the grade a-f or A-F (x/X to exit) --> ");
			grade = sc.next().toLowerCase();

			// check for length of input
			if (grade.length() > 1) {
				System.out.println("Letter entered was not in range ! " + grade);

				// if length is one char
			} else if (grade.length() == 1) {
				if (grade.charAt(0) == 'a') {
					a++;
				} else if (grade.charAt(0) == 'b') {
					b++;
				} else if (grade.charAt(0) == 'c') {
					c++;
				} else if (grade.charAt(0) == 'd') {
					d++;
				} else if (grade.charAt(0) == 'e') {
					e++;
				} else if (grade.charAt(0) == 'f') {
					f++;

				} else if (grade.charAt(0) == 'x') {
					System.out.println("X entered, end of application");
					break;
				}
			}

		}
		System.out.println("Number of A's is " + a);
		System.out.println("Number of B's is " + b);
		System.out.println("Number of C's is " + c);
		System.out.println("Number of D's is " + d);
		System.out.println("Number of E's is " + e);
		System.out.println("Number of F's is " + f);
	}

	private static void whileHistogram() {
		System.out.print("Enter number of rows --> ");
		int rows = sc.nextInt();

		System.out.print("Enter number of cols --> ");
		int cols = sc.nextInt();

		char star = '*';

		String line = "";

		while (rows != 0) {

			while (cols != 0) {

				line += star;
				cols--;
			}
			System.out.println(line);
			rows--;
		}System.out.println("end of program");
	}
	
	private static void whileLargestSmallest() {
		
	}
}