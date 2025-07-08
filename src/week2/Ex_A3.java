package week2;

import java.util.Scanner;

public class Ex_A3 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		AssignmentTests();
	}
	
	public static void AssignmentTests() {
		
		int x = 0;
		//999 will terminate application
		while(x!=999) {
		System.out.println();
		System.out.println("Enter integer (1..10) : ");
		x = sc.nextInt();
		
		if(1<=x && x<=5) {
			System.out.println("The square of " + x + " is " +  (double) Math.pow(x, 2));
		}
		else if(6<=x && x<=10) {
			System.out.println("The cube of " + x + " is " +  Math.pow(x, 3));
		}
		else if(0>=x || x>10) {
			System.out.println("Input value outside of range 1...10: " + x);
			}
		}System.out.println("End of application, entered 999");
	}
}
