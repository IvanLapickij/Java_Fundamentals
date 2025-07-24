package week5;

public class PhoneTester {

	public static void main(String[] args) {
Phone samsung = new Phone();
System.out.println("Details for samsung - defaults");
System.out.println(samsung.getPhoneNumber());
System.out.println(samsung.getOwnersName());
System.out.println(samsung.getPrice());
System.out.println("");

Phone iPhone = new Phone("999", "John", 88.50);
System.out.println(iPhone.getPhoneNumber());
System.out.println(iPhone.getOwnersName());
System.out.println(iPhone.getPrice());
System.out.println("");

iPhone.setOwnersName("Tome");
iPhone.setPhoneNumber("110");
iPhone.setPrice(110.50);
System.out.println("Updated details for iPhone");
System.out.println(iPhone.getPhoneNumber());
System.out.println(iPhone.getOwnersName());
System.out.println(iPhone.getPrice());
System.out.println("");
	}

}
