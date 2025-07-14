package week2;
import java.util.Scanner;
public class Ex_B2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		
		IfLogicalOps(num1,num2);

		}

	private static void IfLogicalOps(int n1, int n2) {
		
		if(n1==0 || n2==0) {
			System.out.println("One of numbers is 0");
		}
		else if((n1<0 && n2>0)||(n1>0 && n2<0)) {
			System.out.println("One of numbers is negative");
		}
		else if(n1<0 && n2<0) {
			System.out.println("Both numbers are negative");
		}
		else {
			System.out.println("Both numbers are positive");
		}
		
	}
}
