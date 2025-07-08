package week2;

import java.util.Scanner;

public class Ex_A4 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		CapitalLetter();
	}
	
	public static void CapitalLetter() {
		
		char c = 'a';
		//999 will terminate application
		while(c!='x') {
		System.out.println();
		System.out.println("Enter a letter (a-zA-Z): ");
		c = sc.next().charAt(0);
		System.out.println();
		
		if(Character.isLowerCase(c)) {
			System.out.println("Lowercase: " + c);
			System.out.println("The ASCII value of " + c + " is " + (int) c);
			System.out.println();

		}
		else if(Character.isUpperCase(c)) {
			System.out.println("Uppercase: " + c);
			System.out.println("The ASCII value of " + c + " is " + (int) c);
			System.out.println();
		}
		else {
			System.out.println("Error in input" + c);
		}
		
		
		
		}System.out.println("End of application, entered x");
	}
}
