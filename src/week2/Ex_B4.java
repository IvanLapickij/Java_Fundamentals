package week2;
import java.util.Scanner;
public class Ex_B4 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		Modulus(num1,num2);

	}
	private static void Modulus(int x, int y) {
		
		if(x%y==0) {
			System.out.println(x + " is a multiple of " + y);
		}
		else {
			System.out.println(x + " is not a multiple of " + y);
		}
		
	}

}
