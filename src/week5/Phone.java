package week5;

public class Phone {
	String phoneNumber;
	String ownersName;
	double price;
	public Phone() {
		super();
	}
	public Phone(String phoneNumber, String ownersName, double price) {
		super();
		this.phoneNumber = phoneNumber;
		this.ownersName = ownersName;
		this.price = price;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
