package week1;

import java.util.Scanner;

public class RoomPaintApp_4 {

	public static void main(String[] args) {
		
		//define scanner
		Scanner sc = new Scanner(System.in);
		
		//height
		System.out.println("Enter room height(m): ");
		double height = sc.nextDouble();

		//length
		System.out.println("Enter room length (m): ");
		double length  = sc.nextDouble();

		//width
		System.out.println("Enter room width(m): ");
		double width = sc.nextDouble();
		
		//surface area
		double surfaceArea = 2*height*(length+width);
		System.out.println("Wall surface area: " + surfaceArea + "m\u00B2");
		
		//liters of paint
		double litersOfPaint = Math.ceil(surfaceArea/10);
		System.out.println(litersOfPaint);

		//cost of litter
		double price = 14.50;
		double costOfLitter = litersOfPaint*price;
		System.out.println("Total cost: " + costOfLitter);
	}

}
