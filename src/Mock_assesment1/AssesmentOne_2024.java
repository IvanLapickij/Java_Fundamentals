package Mock_assesment1;

import java.util.Scanner;

public class AssesmentOne_2024 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// question1();
		// question2();
		question3();
	}

	public static void question1() {
		System.out.println("Check if you can vote:");
		System.out.print("Enter your age ");
		int age = sc.nextInt();

		System.out.println("Are you a citizen? (true/false): ");
		boolean citizen = sc.nextBoolean();
		allowedToVote(age, citizen);
	}

	public static void allowedToVote(int age, boolean citizen) {
		if (age >= 18 && citizen == true) {
			System.out.println("You are eligible to vote!");
		} else {
			System.out.println("You are not eligible to vote.");
		}
	}

	public static void question2() {
		System.out.println("Please enter two whole numbers and get some operations: ");
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		System.out.print("Which operation do you want (+,-,*,/) ?");
		String op = sc.next();

		myCalculator(num1, op, num2);

	}

	public static void myCalculator(int num1, String op, int num2) {

		int result = 0;
		switch (op) {
		case "+":
			result = num1 + num2;
			System.out.println(num1 + " addition to " + num2 + " is " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1 + " subtracted from " + num2 + " is " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1 + " times " + num2 + " is " + result);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("Cannot divide by zero!");
				break;
			} else {
				result = num1 / num2;
				System.out.println(num1 + " times " + num2 + " is " + result);
				break;
			}

		default:
			System.out.println("invalid opperation. Pleas enter one of (+,-,*,/)");
		}
	}

	public static void question3() {
		System.out.print("Enter a character: ");
		char input = sc.next().charAt(0);
		myChar(input);

	}

	public static void myChar(char input) {

		if (Character.isDigit(input)) {
			System.out.println("You entered a digit");
		}
		//else if(Character.)

	}

}
