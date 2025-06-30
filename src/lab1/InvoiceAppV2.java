package lab1;

import java.util.Scanner;

public class InvoiceAppV2 {
	public static void main(String[] args) {
		
		//define scanner
		Scanner sc = new Scanner(System.in);
				
		
		//welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		
		
		
		
		int invoices = 0;
		int countInvoicesOnDisscount = 0;
		double AverageInvoice = 0;
		double AverageDisscount = 0;
		
		
		
		
		// Invoice generator start of loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			
			//define Subtotal input
			System.out.println("Enter subtotal: ");
			double subtotal = sc.nextDouble();
			//double subtotal = 0;
			double discountPercent = 0.1;
			
			
				//evaluate user input(subtotal)
				if(subtotal>0) {
					if(subtotal>=500) {
						
						// display the discount ammount and total
						discountPercent=0.25;
						double discountAmmount = subtotal* discountPercent;
						double total = subtotal - discountAmmount;
						System.out.println("Subtotal:	  "+subtotal);
						System.out.println("Discount percent: "	+ discountPercent);
						System.out.println("Discount ammount: "	+ discountAmmount);
						System.out.println("Invoice total:	  "			+ total);
						
						countInvoicesOnDisscount +=1;
						invoices += 1;
						AverageInvoice +=total;
						AverageDisscount += discountAmmount;
						
						System.out.println("Continue ? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(subtotal>=200) {
						
						discountPercent=0.2;
						double discountAmmount = subtotal* discountPercent;
						double total = subtotal - discountAmmount;
						System.out.println("Subtotal:	  "+subtotal);
						System.out.println("Discount percent: "	+ discountPercent);
						System.out.println("Discount ammount: "	+ discountAmmount);
						System.out.println("Invoice total:	  "			+ total);
						
						countInvoicesOnDisscount +=1;
						invoices += 1;
						AverageInvoice +=total;
						AverageDisscount += discountAmmount;
						
						System.out.println("Continue ? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(subtotal>=100) {
						
						discountPercent=0.1;
						double discountAmmount = subtotal* discountPercent;
						double total = subtotal - discountAmmount;
						System.out.println("Subtotal:	  "+subtotal);
						System.out.println("Discount percent: "	+ discountPercent);
						System.out.println("Discount ammount: "	+ discountAmmount);
						System.out.println("Invoice total:	  "			+ total);
						
						countInvoicesOnDisscount +=1;
						invoices += 1;
						AverageInvoice +=total;
						AverageDisscount += discountAmmount;
						
						System.out.println("Continue ? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
					else if(100>subtotal) {
						
						discountPercent=0;
						double discountAmmount = subtotal* discountPercent;
						double total = subtotal - discountAmmount;
						System.out.println("Subtotal:	  "+subtotal);
						System.out.println("Discount percent: "	+ discountPercent);
						System.out.println("Discount ammount: "	+ discountAmmount);
						System.out.println("Invoice total:	  "			+ total);
						
						
						invoices += 1;
						AverageInvoice +=total;
						AverageDisscount += discountAmmount;
						
						System.out.println("Continue ? (y/n): ");
						choice = sc.next();
						System.out.println();
					}
				}
				else {
					System.out.println("Your input: " + subtotal);
					System.out.println("Please enter valid Integer number thas is bigger than 0");
					System.out.println("Would you like to continue ? (y/n): ");
					choice = sc.next();
				}
			}
				System.out.println("Application is closed");
				System.out.println();
				System.out.println("Number of invoices: " + invoices);
				System.out.println("Average invoice: " + AverageInvoice/invoices);
				System.out.println("Average discount: " + AverageDisscount/countInvoicesOnDisscount);
	}
}