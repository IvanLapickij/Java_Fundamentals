package week1;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		System.out.println("Welcome to MenuApp application please make you choice 1-3 \n");
		
		Scanner sc = new Scanner(System.in); //Create a scanner object
		
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			
			System.out.println("----- MENU -----");
			System.out.println("1. Say Hello");
			System.out.println("2. Show your name");
			System.out.println("3. Exit");
			int menuChoice = sc.nextInt(); // Reads user input

			
			
			if(menuChoice == 1) {
				System.out.println("Hello there!");
				System.out.println("Do you want to continue? (y/n): ");
				choice = sc.next(); // Reads user input
			}
			else if(menuChoice == 2) {
				System.out.println("My name is MenuApp.");
				System.out.println("Do you want to continue? (y/n): ");
				choice = sc.next(); // Reads user input
			}
			else if(menuChoice == 3) {
				System.out.println("You press Exit application.");
				break;
			}
			
		}
		System.out.println("Goodbye!");
		
	}

}
