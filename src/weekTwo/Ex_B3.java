package weekTwo;
import java.util.Scanner;
public class Ex_B3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		MathsOps(num1,num2);

	}
	private static void MathsOps(int n1, int n2) {
		System.out.println("The sum of " + n1 + " and " + n2 + " is: " + (n1+n2));
		System.out.println("The product of " + n1 + " and " + n2 + " is: " + (n1*n2));
		System.out.println("The difference of " + n1 + " and " + n2 + " is: " + (n1-n2));
		
		if(n1==0) {
			System.out.println("num1 is " + n1 + "; " + "cannot divide by 0 :" + n1);
		}
		else if(n2==0) {
			System.out.println("num1 is " + n2 + "; " + "cannot divide by 0 :" + n2);
		}
		else {
			System.out.println("The division of " + n1 + " and " + n2 + " is: " + (n1/n2));
		}
	}

}
