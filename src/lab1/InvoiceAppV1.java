package lab1;

public class InvoiceAppV1 {
	public static void main(String[] args) {
		double subtotal = 200;
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
	}
}