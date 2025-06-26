package lab1;

import java.util.Scanner;

public class InvoiceAppV2 {
	public static void main(String[] args) {
		
		//define scanner
		Scanner sc = new Scanner(System.in);
				
		//double subtotal = 200;
		double discountPercent = 0.1;
		double discountAmmount = subtotal* discountPercent;
		double total = subtotal - discountAmmount;
		//welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		
		
		
		// display the discount ammount and total
		System.out.println("Subtotal:	  "+subtotal);
		System.out.println("Discount percent:   "	+ discountPercent);
		System.out.println("Discount ammount: "	+ discountAmmount);
		System.out.println("Total:		  "			+ total);
		
		
		
		
		// Invoice generator start of loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
				
			//define Subtotal input
			System.out.println("Enter subtotal: ");
			double subtotal = sc.nextDouble();
				//evaluate user input(Carspeed)
				if(subtotal>0) {
					if(subtotal>120) {
						System.out.println("Over Speed Limit - Fined!");
						System.out.println("Do you want to check another speed? (y/n): ");
						choice = sc.next();
					}
					else if(120>=carSpeed && carSpeed>110) {
						System.out.println("Over Speed Limit - Warning!");
						System.out.println("Do you want to check another speed? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(99>carSpeed && carSpeed>60) {
						System.out.println("Normal Speed");
						System.out.println("Do you want to check another speed? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(59>carSpeed && carSpeed>30) {
						System.out.println("Cautios Driving");
						System.out.println("Do you want to check another speed? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(30>carSpeed) {
						System.out.println("Too Slow - Hazardous!");
						System.out.println("Do you want to check another speed? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
				}
			}
				System.out.println("Application is closed");
	}
}