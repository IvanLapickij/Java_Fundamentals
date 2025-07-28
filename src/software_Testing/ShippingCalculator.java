package software_Testing;

import java.util.Scanner;

public class ShippingCalculator {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Types of shiping:");
			System.out.println("*Standart - S");
			System.out.println("Express - E");
			System.out.println("Overnight - O");
			System.out.println("");
			System.out.println("Please enter type of shipping: ");
			char shippingTypec = sc.next().charAt(0);

			System.out.println("Please enter weight KG");
			int weightc = sc.nextInt();
			calculateShippingCost(shippingTypec,weightc);
			
			if(shippingTypec=='S' || shippingTypec=='E' || shippingTypec=='O') {
				break;
			}else {
				System.out.println("Please enter valid option: 'S', 'E', 'O'");
			}
			
			//if(weightc>0 || weightc)
		}
		
//		testStandartShipping();
//		testExpressShipping();
//		testOvernightShipping();
//		testNoShippingOption();
//		testZeroWeight();
//		testNegativeWeight();
//		

	}

	public static void calculateShippingCost(char shippingType, double weight) {

		int pricePerKg = 0;

		String typeOfShipment = "";
		

		if (shippingType == 'S') {
			typeOfShipment = "Standart";
			pricePerKg = 5;
		} else if (shippingType == 'E') {
			typeOfShipment = "Express";
			pricePerKg = 10;
		} else if (shippingType == 'O') {
			typeOfShipment = "Overnight";
			pricePerKg = 20;
		}
		System.out.println("Your type of Shipment is " + typeOfShipment + "kg");
		System.out.println("Your shipments price is " + weight*pricePerKg + "$");
	}

}
