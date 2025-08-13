package practice_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Prisoner {
	private String immateNumber, name = "unknown";
	private int sentenceLength, yearStarted = 0;
	private boolean wellBehaved, lifeWithoutParole = false;

	Prisoner(String immateNumber, String name, int sentenceLength, int yearStarted, boolean wellBehaved,
			boolean lifeWithoutParole) {
		this.immateNumber = immateNumber;
		this.name = name;
		this.sentenceLength = sentenceLength;
		this.yearStarted = yearStarted;
		this.wellBehaved = wellBehaved;
		this.lifeWithoutParole = lifeWithoutParole;
	}

	public String getImmateNumber() {
		return immateNumber;
	}

	public void setImmateNumber(String immateNumber) {
		this.immateNumber = immateNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSentenceLength() {
		return sentenceLength;
	}

	public void setSentenceLength(int sentenceLength) {
		this.sentenceLength = sentenceLength;
	}

	public int getYearStarted() {
		return yearStarted;
	}

	public void setYearStarted(int yearStarted) {
		this.yearStarted = yearStarted;
	}

	public boolean isWellBehaved() {
		return wellBehaved;
	}

	public void setWellBehaved(boolean wellBehaved) {
		this.wellBehaved = wellBehaved;
	}

	public boolean isLifeWithoutParole() {
		return lifeWithoutParole;
	}

	public void setLifeWithoutParole(boolean lifeWithoutParole) {
		this.lifeWithoutParole = lifeWithoutParole;
	}

	@Override
	public String toString() {
		return "Prisoner [immateNumber=" + immateNumber + ", name=" + name + ", sentenceLength=" + sentenceLength
				+ ", yearStarted=" + yearStarted + ", wellBehaved=" + wellBehaved + ", lifeWithoutParole="
				+ lifeWithoutParole + "]";
	}

}

public class Prison_assesment2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Prisoner> prisonerTypes = new ArrayList<Prisoner>();
		final int addPrisoner = 1, changePrisonerDetails = 2, releasePrisoner = 3, howManyLifers = 4, eligilbeForParole = 5, display = 6, EXIT =7;
		System.out.println("Prison ");
		
		boolean exitProgram  = false;
			while (!exitProgram ) {

			    switch (userChoice()) {
			        case addPrisoner:
			            addPrisoner(prisonerTypes);
			            break;
			        case changePrisonerDetails:
			            changePrisonerDetails(prisonerTypes);
			            break;
			        case releasePrisoner:
			            releasePrisoner(prisonerTypes);
			            break;
			        case howManyLifers:
			            howManyLifers(prisonerTypes);
			            break;
			        case eligilbeForParole:
			            eligilbeForParole(null, prisonerTypes);
			            break;
			        case display:
			            display(prisonerTypes);
			            break;
			        case EXIT:
			        	exitProgram  = true;
			            break;
			        default:
			            System.out.println("Unknown entry");
			    }
			}

	}

	public static int userChoice() {
	    int choice = 0;
	    while (true) {
	        try {
	            System.out.println("What do you want to do? ");
	            System.out.println("1. Add a prisoner");
	            System.out.println("2. Change a prisoner details");
	            System.out.println("3. Release a prisoner");
	            System.out.println("4. How many lifers?");
	            System.out.println("5. Eligible for parole?");
	            System.out.println("6. Show prisoners");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice --> ");

	            choice = sc.nextInt();
	            if (choice >= 1 && choice <= 7) {
	                return choice;
	            } else {
	                System.out.println("Please enter a number between 1 and 7.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input! Please enter a number between 1 and 7.");
	            sc.nextLine(); // clear invalid input
	        }
	    }
	}


	public static void addPrisoner(ArrayList<Prisoner> prisoners) {
		
		System.out.print("Enter the immage number --> ");
		String immateNumber = sc.next();
		//already exists
		if(prisonerExists(immateNumber, prisoners)!=-1) {
			System.out.println("Prisoner " + immateNumber + " already exists...");
		}
		//not found
		else {
			System.out.print("Enter prisoners name --> ");
			String name = sc.next();
			
			System.out.print("Enter the prisoners sentence --> ");
			int sentenceLength = sc.nextInt();
			
			//if 40+ years then life without parole
			boolean lifeWithoutParole = false;
			if(sentenceLength>40) {
				lifeWithoutParole = true;
			}
			
			System.out.print("What year did he/she start his/her sentence? --> ");
			int yearStarted = sc.nextInt();
			
			System.out.print("Is this prisoner well behaved (true/false)? --> ");
			boolean wellBehaved = sc.nextBoolean();
			
			//create prisoner
			Prisoner prisoner = new Prisoner(immateNumber, name, sentenceLength, yearStarted, wellBehaved, lifeWithoutParole);
			//add to list
			prisoners.add(prisoner);
			//display
			display(prisoners);
			
		}
	}

	public static int prisonerExists(String inmateNumber, ArrayList<Prisoner> prisoners) {
	    for (int i = 0; i < prisoners.size(); i++) {
	        if (prisoners.get(i).getImmateNumber().equalsIgnoreCase(inmateNumber)) {
	            return i; // found, return index
	        }
	    }
	    return -1; // not found
	}

	public static void changePrisonerDetails(ArrayList<Prisoner> prisoners) {

	}

	public static void releasePrisoner(ArrayList<Prisoner> prisoners) {
		
	}

	public static int howManyLifers(ArrayList<Prisoner> prisoners) {
		int countLifers = 0;
		for (int i = 0; i < prisoners.size(); i++) {
			if(prisoners.get(i).isLifeWithoutParole()) {
				countLifers+=1;
			}
	    }
		System.out.println(countLifers);
		return countLifers;

	}

	public static void display(ArrayList<Prisoner> prisoners) {
	    if (prisoners.isEmpty()) {
	        System.out.println("No prisoners to show.");
	        return;
	    }
	    for (int i = 0; i < prisoners.size(); i++) {
	        System.out.println((i + 1) + ". " + prisoners.get(i)); // uses toString()
	    }
	}


	public static boolean eligilbeForParole(String immateNumber, ArrayList<Prisoner> prisoners) {
		
		return false;

	}

}
