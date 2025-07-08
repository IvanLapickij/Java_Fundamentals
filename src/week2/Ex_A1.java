package week2;

import java.util.Scanner;

public class Ex_A1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AsciiValues();
		

	}
	
//	AsciiValues method
	public static void AsciiValues () {
		
		
		
		char character = 'a';
		while((int)character!=120) {
			System.out.println("Enter char: ");
			character = sc.next().charAt(0);
			Character.isDigit(character);
			System.out.println("Ascii value of " + character + " is " + (int)character);
			
		}
		System.out.println("You entered X.");
		System.out.println("End of loop");
		
	}
}
