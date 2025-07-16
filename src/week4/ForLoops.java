package week4;

import java.util.Scanner;

public class ForLoops {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// forHeaderTesting();
		forSmallestLargest();
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

		if(n<=0) {
			System.out.println("n was invalid: " + n);
		}else {
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
		
		if(n>=0) {
			System.out.println("The smallest number entered is: " + smallest);
			System.out.println("The largest number entered is: " + largest);
		}
		
	}

}
