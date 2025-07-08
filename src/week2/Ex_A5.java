package week2;

import java.util.Scanner;

public class Ex_A5 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Circle();
	}

	private static void Circle() {
		
		System.out.println("Enter radius: ");
		int r = sc.nextInt();	
		final double PI = 3.14;
		final double diameter = 2*r;
		final double circumference = 2*PI*r;
		final double area = PI*Math.pow(r, 2);
		
		System.out.println("The diameter is " + diameter);
		System.out.println("The circumference is " + circumference);
		System.out.println("The area is " + area);
		
	}

}
