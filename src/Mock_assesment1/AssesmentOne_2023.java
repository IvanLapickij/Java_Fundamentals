package Mock_assesment1;
//Ivan Lapickij
import java.util.Scanner;

public class AssesmentOne_2023 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//allowedToDrive();
		//evenNumbers();
		printStars();
	}

	public static boolean allowedToDrive() {
		
		System.out.print("Have you a full drivers license? ");
		boolean answer = sc.nextBoolean();
		
		if(answer){
			System.out.print("Are you insured ? ");
			answer = sc.nextBoolean();
			if(answer) {
				System.out.print("Is the car taxed? ");
				answer = sc.nextBoolean();
				if(answer) {
					System.out.println("Enjoy driving your car!");
				}
			}
		}
		if(!answer) {
			System.out.println("Sorry , you cannot drive the car.");
			return answer;
		}
		return answer;
		
		
	}

	public static void evenNumbers() {
		System.out.print("Please low number: ");
		int num1 = sc.nextInt();
		System.out.print("Please high number: ");
		int num2 = sc.nextInt();
		
		for(;num1<num2;num1++) {
			if(num1%2==0) {
				System.out.println(num1);
			}
		}if(num2%2==0) {
			System.out.println(num2);
		}
	}

	public static void printStars() {
		System.out.print("How many stars? : ");
		int numStars = sc.nextInt();
		String star = "*";
		String stars ="";
		for(int i =0; i<numStars; i++) {
			stars+=star;
			System.out.println(stars);
		}
		
		for(int i =numStars; i>0; i--) {
			for(int x =0; x<i;x++) {
				System.out.print('*');
			}System.out.println();
		}
	}
}