//Student Name: Ivan Lapickij A00277326
package cse.assessment.two;

import java.util.Scanner;

public class AssessmentTwo2025 {

	static Scanner sc = new Scanner(System.in);
	static final int STARTING_HP = 10;

	public static void main(String[] args) {

		System.out.println("Assessment Two CSE 2025");

		String choice = "y";

		// Outer: //Optional use of this label

		outerLoop: while (choice.equalsIgnoreCase("y")) {
			System.out.println("Select the exercise: ");
			System.out.println("1 - Dice Duel Game");
			System.out.println("2 - Reverse a Number");
			System.out.println("3 - Draw Pyramid");
			System.out.println("4 - Exit");

			// CODE MENU Here
			try {

				System.out.println("Please choose the game");
				// handle with try catch invalid input
				int choice2 = sc.nextInt();
				switch (choice2) {
				case 1:
					duelGame();
					break;
				case 2:
					reverseNumber();
					break;
				case 3:
					drawPyramid();
					break;
				case 4:
					break outerLoop;
				}
			} catch (Exception e) {
				System.out.println("Invalid input");
				choice = sc.next();// doesnt look like it worked after thats why i inserted here
			}
			System.out.println("Do you want to go back to main menu? (y/n)");
			choice = sc.next();

		}

	}

	public static void duelGame() {
		System.out.println("\n--- Welcome to Dice Duel Game App---");
		// CODE Duel Game Here
		// ask for player 1 name
		System.out.println("Enter name for Player 1: ");
		String nameP1 = sc.next();
		// ask for player 2 name
		System.out.println("Enter name for Player 2: ");
		String nameP2 = sc.next();

		// define players Health points
		int p1HP = STARTING_HP;
		int p2HP = STARTING_HP;

		int p1Roll = 0;
		int p2Roll = 0;

		while (p1HP > 0 && p2HP > 0) {
			// define random attack

			p1Roll = rollDice();
			p2Roll = rollDice();
			if (p1HP > 0 && p2HP > 0) {// continue if hp is not 0
				
				
				// Player 1 attacks
				System.out.println(nameP1 + " attacks!");
				// attack succesfull by P1
				if (p1Roll > p2Roll) {
					System.out.println(nameP1 + " rolled " + p1Roll);
					System.out.println(nameP2 + " defended with: " + p2Roll);
					System.out.println(nameP2 + " takes " + p1Roll + " damage.");
					System.out.print("Hp now: " + (p2HP -= p1Roll));
					System.out.println();

					// attack defended by P2
				} else if (p1Roll <= p2Roll) {
					System.out.println(nameP1 + " rolled " + p1Roll);
					System.out.println(nameP2 + " defended " + p2Roll);
					System.out.println("Attack blocked!");
					System.out.println();
				}
			}
			
			// Player 2 attacks
			if (p1HP > 0 && p2HP > 0) {// continue if hp is not 0
				// Player 2 attacks
				p1Roll = rollDice();
				p2Roll = rollDice();

				System.out.println(nameP2 + " attacks!");
				// attack succesfull by P1
				if (p2Roll > p1Roll) {
					System.out.println(nameP2 + " rolled " + p2Roll);
					System.out.println(nameP1 + " defended with: " + p1Roll);
					System.out.println(nameP1 + " takes " + p2Roll + " damage.");
					System.out.print("Hp now: " + (p1HP -= p2Roll));
					System.out.println();

					// attack defended by P1
				} else if (p2Roll <= p1Roll) {
					System.out.println(nameP2 + " rolled " + p2Roll);
					System.out.println(nameP1 + " defended " + p1Roll);
					System.out.println("Attack blocked!");
					System.out.println();
				}

			}

		}
		// name winner
		if (p1HP > p2HP) {
			System.out.println(nameP1 + " wins!");
		} else {
			System.out.println(nameP2 + " wins!");
		}

	}

	public static void reverseNumber() {
		System.out.println("\n--- Welcome to Reverse a Number App---");
		System.out.print("Enter a number: ");

		// CODE Reverse Number Here
		try {
			// take input as integer
			int inputNumber = sc.nextInt();

			String reversedStr = "";
			// change type to string
			String originalStr = "" + inputNumber;

			for (int i = 0; i < originalStr.length(); i++) {
				reversedStr = originalStr.charAt(i) + reversedStr;
			}

			System.out.println("Reversed number: " + reversedStr);
		} catch (Exception e) {
			System.out.println("Please enter Integer");
			System.out.println();
		}
	}

	public static void drawPyramid() {
		System.out.println("\n--- Welcome to Pyramid Drawing App---");
		// CODE Pyramid Draw Here
		System.out.print("Enter pyramid height: ");
		int height = sc.nextInt();

		System.out.print("Enter a symbol: ");
		char symbol = sc.next().charAt(0);

		String line = "";
		while (height != 0) {

			line += symbol;
			System.out.println(line);
			height--;
		}
	}

	public static int rollDice() {
		// CODE rollDice() here 1-6
		int randomNum = (int) (Math.random() * 6); // produces random number 1-6
		return randomNum; // Of course change this return...
	}
}
