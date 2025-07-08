package week1;

import java.util.Scanner;

public class SpeedLimitCheckerApp_5 {

	public static void main(String[] args) {
		
		
		//define scanner
		Scanner sc = new Scanner(System.in);
		
		
		
		//checkAnotherSpeed
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		
		//Car speed
		System.out.println("Enter speed of vechile(km/h): ");
		double carSpeed = sc.nextDouble();
		//evaluate user input(Carspeed)
		if(250>carSpeed && carSpeed>0) {
			if(carSpeed>120) {
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
