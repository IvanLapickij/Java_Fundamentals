package week2;
import java.util.Scanner;
public class Ex_B1_conversion {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int z =0;
		System.out.println("++z is : " + ++z);
		IncrementDecrement ();

	}

	private static void IncrementDecrement() {
		
		int x=5;
		int y=10;
		int intExpression = 0;
		String stringExpression = " ";
		String firstPart = "The value of ";
		String isWord = " is: ";
		
		
		//ask user to insert calculation as math expression
		System.out.println("Please enter ");
		intExpression = sc.nextInt();
		System.out.println("Aritmethic calculation in Int is: " + String.valueOf(intExpression));
		
		//convert String expression to math/integer expression
		
		
		//final output firstPart+stringExpression+isWord+intExpression
		System.out.println(firstPart+stringExpression+isWord+intExpression);

		
	}

}

