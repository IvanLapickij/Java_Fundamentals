package Mock_assesment1;

import java.util.Scanner;

public class AssesmentOne_2024 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//question1();
		//question2();
		//question3();
	}

	public static void question1() {
		System.out.println("Check if you can vote:");
		System.out.print("Enter your age ");
		int age = sc.nextInt();

		System.out.println("Are you a citizen? (true/false): ");
		boolean citizen = sc.nextBoolean();
		allowedToVote(age,citizen);
	}

	public static void allowedToVote(int age, boolean citizen) {
		if(age>=18 && citizen == true) {
			System.out.println("You are eligible to vote!");
		}else {
			System.out.println("You are not eligible to vote.");
		}
	}

	public static void question2() {

	}

	public static void myCalculator(int num1, String op, int num2) {

	}

	public static void question3() {

	}

	public static void myChar(char input) {

	}

}
