package methods;

import java.util.Scanner;

public class MethodExercises {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter first number: ");
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Please enter second number: ");
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		
		System.out.println("The sum of " + x + " and " + y + " is " + calculateSum(x,y));
		System.out.println("The product of " + x + " and " + y + " is " + calculateProduct(x,y));
		System.out.println("The difference of " + x + " and " + y + " is " + calculateProduct(x,y));
		System.out.println("The quotient of " + x + " and " + y + " is " + calculateProduct(x,y));


	}
	
	public static int calculateSum(int a, int b) {
		return a+b;
		
	}
	
	public static int calculateProduct(int a, int b) {
		return a*b;
		
	}
	
	public static int calculateDifference(int a, int b) {
		return a-b;
		
	}
	
	public static int calculateQuotient(int a, int b) {
		return a/b;
		
	}
	
	public static int calcVolume(int a, int b, int c) {
		return 0;
		
	}
	
	public static int calcVolume() {
		return 0;
		
	}
	
	public static void coordGeometry() {
		
	}
	
	public static double calcDistance(double a, double b, double c, double d) {
		return 0;
		
	}
	
	public static double calcHypotenuse(double a, double b) {
		return 0;
		
	}
	
	public static int addNumbers(int a) {
		return 0;
		
	}

}
