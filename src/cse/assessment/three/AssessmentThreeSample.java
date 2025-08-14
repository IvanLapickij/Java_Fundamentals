package cse.assessment.three;

import java.util.ArrayList;
import java.util.Scanner;

class Dog{
	private String name;
	private String tagNumber;
	private int numDaysInPound;
	private boolean healthy;


	Dog(String name, String tagNumber, int numDaysInPound, boolean healthy) {
		this.name = name;
		this.tagNumber = tagNumber;
		this.numDaysInPound = numDaysInPound;
		this.healthy = healthy;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTagNumber() {
		return tagNumber;
	}


	public void setTagNumber(String tagNumber) {
		this.tagNumber = tagNumber;
	}


	public int getNumDaysInPound() {
		return numDaysInPound;
	}


	public void setNumDaysInPound(int numDaysInPound) {
		this.numDaysInPound = numDaysInPound;
	}


	public boolean isHealthy() {
		return healthy;
	}


	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", tagNumber=" + tagNumber + ", numDaysInPound=" + numDaysInPound + ", healthy="
				+ healthy + "]";
	}	


}




public class AssessmentThreeSample {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final int ADD = 1, UPDATE = 2, DELETE_ONE_DOG = 3, VET_VISITING = 4, DISPLAY_DOGS = 5, EXIT = 6;
		String userContinue = "y";
		ArrayList<Dog> dogs = new ArrayList<>();
		System.out.println("Dog Pound");
		
		while(userContinue.equalsIgnoreCase("y")) {
			switch (userChoice()) {
			case ADD:
				add(dogs);				
				break;
			case UPDATE:
				update(dogs);				
				break;
			case DELETE_ONE_DOG:
				deleteDog(dogs);				
				break;
			case VET_VISITING:
				vetVisiting(dogs);				
				break;
			case DISPLAY_DOGS:
				display(dogs);				
				break;
			case EXIT:
				userContinue = "n";				
				break;
			default:
				System.out.println("Unknown entry: ");
				break;
			}
		}
		

	}

	public static int userChoice() {
		System.out.println("What do you want to do?");
		System.out.println("1. Add a Dog");
		System.out.println("2. Update a Dog");
		System.out.println("3. Delete a Dog");
		System.out.println("4. Vet Visiting");
		System.out.println("5. Display Dogs");
		System.out.println("6. Exit");		
		return sc.nextInt();
	}

	public static void add(ArrayList<Dog> dogsAL) {
		System.out.print("Enter the dog's tag number --> ");
		String dogTagNo = sc.next();
		
		if(dogExists(dogTagNo, dogsAL) >=0) {
			System.out.println("Dog with tag number " + dogTagNo + " is already in the list...");
		}else {
			System.out.print("Enter the dog's name ==> ");
			String dogName = sc.next();
			System.out.print("Is the dog healthy (true/false) --> ");
			boolean dogHealthy = sc.nextBoolean();
			Dog dog = new Dog(dogName, dogTagNo, 0, dogHealthy);
			dogsAL.add(dog);
			display(dogsAL);			
		}

	}

	public static int dogExists(String dogTagNo, ArrayList<Dog> dogsAL) {
		int index = -1;
		for (Dog dog : dogsAL) {
			if (dog.getTagNumber().equals(dogTagNo)) {
				index = dogsAL.indexOf(dog); // 0 1 2 3				
			}
		}
		
		return index;
	}

	public static void update(ArrayList<Dog> dogsAL) {		
		System.out.print("Enter the dog's tag number--> ");
		String dogTagNo = sc.next();
		int index = dogExists(dogTagNo, dogsAL);
		
		if(index < 0) {
			System.out.println(dogTagNo + " does not exist.");
		}else {
			Dog dog = dogsAL.get(index);
			
			exitForLoop: while(true) {
				System.out.print("Enter the feature you wish to update: "
						+ "(N)ame, (D)ays, (H)ealth. Any other key to exit... -->");
				
				String feature = sc.next().toUpperCase();
				switch (feature) {
				case "N":
					System.out.print("Enter the new name --> ");
					dog.setName(sc.next());
					break;
				case "D":
					System.out.print("Enter the new value for Days in the pound --> ");
					dog.setNumDaysInPound(sc.nextInt());
					break;
				case "H":
					System.out.print("Enter the new value for Health (true/false) --> ");
					dog.setHealthy(sc.nextBoolean());
					break;
				default:
					break exitForLoop;
				}
			}
			display(dogsAL);
		}

	}
	public static void deleteDog(ArrayList<Dog> dogsAL) {
		display(dogsAL);
		System.out.print("Enter the dog's tag number--> ");
		String dogTagNo = sc.next();
		int index = dogExists(dogTagNo, dogsAL);
		
		if(index < 0) {
			System.out.println("Could not find tag number: " + dogTagNo + " so could not delete that dog!");
		}else {
			System.out.println("Removing dog " + dogTagNo);
			dogsAL.remove(index);
			display(dogsAL);
		}
		

	}
	public static int vetVisiting(ArrayList<Dog> dogsAL) {
		int count = 0;
		for (Dog dog : dogsAL) {
			if(!dog.isHealthy()) {
				count++;
			}
		}
		System.out.println("The number of sick dogs is: " + count);
		return count;
	}

	public static void display(ArrayList<Dog> dogsAL) {
		for (Dog dog : dogsAL) {
			System.out.println(dog);
		}

	}



}
