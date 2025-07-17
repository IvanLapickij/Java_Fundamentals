//Ivan Lapickij A00277326
package cse.assesment.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssesmentOne2025 {
	static Scanner sc = new Scanner(System.in);
	private final static int CORRECT_PIN = 1234; // {readOnly} means constant?

	public static void main(String[] args) {
		verifyPIN();
		//passwordStrengthTest();
		//programEligibilityCheck();
	}

	public static void verifyPIN() {

		try {
			System.out.println("Q1 - PIN Verification");
			System.out.print("Enter your PIN: ");
			int a = 1;
			int inputPin = sc.nextInt();
			for (; a < 3; a++) {
				if (inputPin == CORRECT_PIN) {
					System.out.println("Access Granted");
					break;
				} else {
					System.out.println("Incorrect PIN , try again. " + (3 - a) + " attempts left");
					System.out.print("Enter your PIN: ");
					inputPin = sc.nextInt();
				}
			}
			if (a == 3) {
				System.out.println("Card Blocked");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Your PIN should be a 4 digit number");
			// how to come back to try ?
		}

	}

	public static void passwordStrengthTest() {
		System.out.println("Q2 - Password Strength Checker");
		System.out.print("Enter your password: ");
		String input = sc.next();
		// contains Upper,Lower,Digits - Success
		// for loop - to loop over string based on length and compare isDigit...
		boolean lower = false;
		boolean upper = false;
		boolean digit = false;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				digit = true;
			}
			if (Character.isUpperCase(input.charAt(i))) {
				upper = true;
			}
			if (Character.isLowerCase(input.charAt(i))) {
				lower = true;
			}

		}
		if (lower && upper && digit) {
			System.out.println("Strong password");
		} else {
			System.out.println("Weak Password");
		}

	}

	public static void programEligibilityCheck() {

		System.out.println("Q3 - Program Eligibility Check");
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		System.out.print("Enter your GPA: ");
		double gpa = sc.nextDouble();

		System.out.print("Do you have research experience? (true/false): ");
		boolean hasResearch = sc.nextBoolean();

		System.out.print("Have you held a leadership role? (true/false): ");
		boolean hasLeadership = sc.nextBoolean();

		checkProgramEligibility(age, gpa, hasResearch, hasLeadership);

	}

	public static boolean checkProgramEligibility(int age, double gpa, boolean hasResearch, boolean hasLeadership) {
		// Rule 1: Age >= 18 && GPA >= 3.5
		// Rule 2: Age >= 16 && GPA >= 3.0 && has research experience && leadership role
		// Otherwise: Not eligible

		if (age >= 18 && gpa >= 3.5) {
			System.out.println("Congratulations! You are eligible for the program.");
			return true;
		} else if (age >= 18 && gpa >= 3.5 && hasResearch && hasLeadership) {
			System.out.println("Congratulations! You are eligible for the program.");
			return true;
		} else {
			System.out.println("Sorry, you are not eligible for the program at this time.");
			return false;
		}
	}

}
