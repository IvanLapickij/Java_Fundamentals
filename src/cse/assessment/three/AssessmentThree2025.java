package cse.assessment.three;
// Ivan Lapickij A00277326
import java.util.ArrayList;
import java.util.Scanner;

public class AssessmentThree2025 {

	// ====== GLOBALS / CONSTANTS ====== TODO
	private static final int BATTERY_CAPACITY_KWH = 50;
	private static final double PRICE_PER_KWH = 0.56;
	private static final double MEVI_SPLIT = 0.30; // 30% percentage to mevi
	private static final double OWNER_SPLIT = 0.70; // 70% percentage to owner

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Car> cars = new ArrayList<>();
		Charger charger = null; // single charger in the system

		// ====== TODO MAIN MENU ======
		final int addCar = 1, registerCharger = 2, displayCars = 3, displayCharger = 4, chargeCar = 5, showEarnings = 6,
				EXIT = 7;

		boolean exitProgram = false;
		while (!exitProgram) {

			switch (userChoice()) {
			case addCar:
				addCar(cars);
				break;
			case registerCharger:
				registerCharger();
				break;
			case displayCars:
				displayCars(cars);
				break;
			case displayCharger:
				displayCharger(charger);
				break;
			case chargeCar:
				chargeCar(cars, charger);
				break;
			case showEarnings:
				showEarnings(charger);
				break;
			case EXIT:
				exitProgram = true;
				break;

			}
		}

	}

	// ====== USERCHOICE ======
	public static int userChoice() {
		System.out.println("=== MEVI Java Prototype (Single-Charger) ===");
		System.out.println("1 - Add Car");
		System.out.println("2 - Register the Charger");
		System.out.println("3 - Display all Cars");
		System.out.println("4 - Display the Charger");
		System.out.println("5 - Charge a Car (record payment)");
		System.out.println("6 - Show MEVI and Owner total earnings");
		System.out.println("7 - Exit");
		System.out.print("Select option: ");

		int intChoice = 0;
		try {
			intChoice = Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.print("Enter a valid integer: ");
		}

		return intChoice;
	}

	// ====== ADD / DISPLAY ====== TODO addCar(ArrayList<Car> cars)
	public static void addCar(ArrayList<Car> cars) {

		boolean exitProgram = false;
		while (!exitProgram) {
			System.out.println("== Add Car ==");

			// ask for reg number
			System.out.print("Enter reg number --> ");
			String carReg = sc.next();

			// already exists
			if (carIndexByReg(carReg, cars) != -1) {
				System.out.println("A car with this reg already exists. ");
				sc.nextLine(); // clear input
			}
			// not found
			else {
				// ask for owner
				System.out.print("Owner name: ");
				String ownerName = sc.next();

				// ask for car type
				System.out.print("Type (EV/ PHEV/ ICE) : ");
				String carType = sc.next();
				if (carType.equalsIgnoreCase("EV") || carType.equalsIgnoreCase("PHEV")
						|| carType.equalsIgnoreCase("ICE")) {

					// ask for initial battery level
					System.out.print("Initial battery level in kWh (0-50): ");
					int baterryLevel = sc.nextInt();
					// not handled invalid values

					// create car
					Car car = new Car(carReg, ownerName, carType, baterryLevel);
					// add to list
					cars.add(car);
					sc.nextLine(); // clear input
					// display
					displayCars(cars);

					System.out.println("");// creates space after output
					exitProgram = true; // exits loop gracefully letting it end on its own any outgoing proccesses.
//		            break;

				} else {
					System.out.println("Invalid type. Must be EV, PHEV, or ICE");
					sc.nextLine(); // clear invalid input
				}

			}
		}
	}

	// ====== REGISTER CHARGER ====== TODO registerCharger() -> careful with return
	// type
	public static Charger registerCharger() {

		System.out.println("");
		// Message confirming user choice
		System.out.println("== Charger ==");
		Charger charger = null;
//		// already exists
		if(charger!=null) {
			System.out.println("A charger is already registered: ");
		}
		else {
			// create new charger
//			// get ID
			System.out.print("Charger ID: ");
			String chargerId = sc.next();
			
			// get address
			System.out.print("Address: ");
			String chargerAddress = sc.next();
	
			// get homeowner
			System.out.print("Homeowner: ");
			String chargerHomeOwner = sc.next();
			sc.nextLine(); // clear input
			
			charger = new Charger (chargerId, chargerAddress, chargerHomeOwner);
			sc.nextLine(); // clear input
			System.out.println(charger);
		}
	
		
//
//		
//
//		
//		//create charger
//		Charger charger = new Charger(chargerId,chargerAddress,chargerHomeOwner);
//		//add to list
//		charger.getChargerId(chargerId);
//		//display
//		display(prisoners);

		return null;
	}

	// ====== DISPLAY CARS ====== TODO displayCars(ArrayList<Car> cars)
	public static void displayCars(ArrayList<Car> cars) {
		if (cars.isEmpty()) {
			System.out.println("No cars to show.");
			return;
		}
		for (int i = 0; i < cars.size(); i++) {
			System.out.println((i + 1) + ". " + cars.get(i)); // uses toString()
		}
	}

	// ====== DISPLAY CHARGER ====== TODO displayCharger(Charger charger)
	public static void displayCharger(Charger charger) {
		if (charger != null) {
			System.out.println("No cars to show.");
		} else {
			System.out.println(charger);
		}
	}

	// ====== CHARGING (single-shot session) ====== TODO chargeCar(ArrayList<Car>
	// cars, Charger charger)
	public static void chargeCar(ArrayList<Car> cars, Charger charger) {

	}

	// ====== EARNINGS ====== TODO showEarnings(Charger charger)
	public static void showEarnings(Charger charger) {
		if(charger==null) {
			System.out.println("charger is " + charger);
		}else {
			System.out.println("== Earnings ==");
			System.out.println(charger);
		}
	}

	// ====== HELPER ====== TODO carIndexByReg(String reg, ArrayList<Car> cars)
	public static int carIndexByReg(String reg, ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getReg().equalsIgnoreCase(reg)) {
				return i; // found, return index
			}
		}
		return -1;
	}

}

// ====== DOMAIN CLASSES (Encapsulated) ======

class Car {
	private String reg;
	private String ownerName;
	private String type; // EV, PHEV, ICE
	private int batteryLevelKWh; // 0..50
	// TODO

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBatteryLevelKWh() {
		return batteryLevelKWh;
	}

	public void setBatteryLevelKWh(int batteryLevelKWh) {
		this.batteryLevelKWh = batteryLevelKWh;
	}

	public Car(String reg, String ownerName, String type, int batteryLevelKWh) {
		super();
		this.reg = reg;
		this.ownerName = ownerName;
		this.type = type;
		this.batteryLevelKWh = batteryLevelKWh;
	}

	@Override
	public String toString() {
		return "Car [reg=" + reg + ", ownerName=" + ownerName + ", type=" + type + ", batteryLevelKWh="
				+ batteryLevelKWh + "]";
	}

}

class Charger {
	private String chargerId;
	private String address;
	private String homeownerName;

	private double totalEarnedMEVI;
	private double totalEarnedOwner;

	public Charger(String chargerId, String address, String homeownerName) {
		this.chargerId = chargerId;
		this.address = address;
		this.homeownerName = homeownerName;
		this.totalEarnedMEVI = 0.0;
		this.totalEarnedOwner = 0.0;
	}

	// Getters
	public String getChargerId() {
		return chargerId;
	}

	public String getAddress() {
		return address;
	}

	public String getHomeownerName() {
		return homeownerName;
	}

	public double getTotalEarnedMEVI() {
		return totalEarnedMEVI;
	}

	public double getTotalEarnedOwner() {
		return totalEarnedOwner;
	}

	// Setters / Mutators
	public void setAddress(String address) {
		this.address = address;
	}

	public void setHomeownerName(String homeownerName) {
		this.homeownerName = homeownerName;
	}

	public void addEarnings(double mevi, double owner) {
		this.totalEarnedMEVI += mevi;
		this.totalEarnedOwner += owner;
	}

	@Override
	public String toString() {
		return "Charger{" + "id='" + chargerId + '\'' + ", address='" + address + '\'' + ", homeowner='" + homeownerName
				+ '\'' + ", earnedMEVI=€" + String.format("%.2f", totalEarnedMEVI) + ", earnedOwner=€"
				+ String.format("%.2f", totalEarnedOwner) + '}';
	}
}
