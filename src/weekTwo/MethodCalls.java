package weekTwo;

import java.util.Scanner;

public class MethodCalls {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Please enter letter");
		char c = sc.next().charAt(0);
		System.out.println(c);
		System.out.println((int)c);
		
		Character.isDigit(c);
		
		boolean isDigit = Character.isDigit(c);
		System.out.println(isDigit);
		
//		int a =3;
//		int b = 5;
//		
//		int sum = a+b;
//		
//		System.out.println("a + b = " + sum);
//		
//		int c =7;
//		int d = 5;
//		
//		int sum2 = c+d;
//		
//		System.out.println("c + d = " + sum2);
		
		int sum1 = add(5,3);
		System.out.println("a + b = " + sum1);
		
		int sum2 = add(7,3);
		System.out.println("a + b = " + sum2);
		
		show();

		String name = "Ivan";
		MethodCalls mc = new MethodCalls();
		mc.printName(name);
	}
	
	private void printName(String name) {
		System.out.println("your name is : "+ name);
		
	}

	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void show() {
		System.out.println("What is your name? ");
		String name = sc.next();
		System.out.println("Hi " + name);
	}
	
	

}
