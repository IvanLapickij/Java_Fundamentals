package weekTwo;
public class Ex_B1 {
	public static void main(String[] args) {
		
		IncrementDecrement ();

	}

	private static void IncrementDecrement() {
		
		int x=5;
		int y=10;

		String firstPart = "The value of ";
		String isWord = " is: ";
		
		String input = "x";
		System.out.println(firstPart + input + isWord + x);
		
		input = "++x";
		System.out.println(firstPart + input + isWord + ++x);
		
		input = "x++";
		System.out.println(firstPart + input + isWord + x++);
		
		input = "x";
		System.out.println(firstPart + input + isWord + x);
		
		input = "y";
		System.out.println(firstPart + input + isWord + y);
		
		input = "--y";
		System.out.println(firstPart + input + isWord + --y);
		
		input = "y--";
		System.out.println(firstPart + input + isWord + y--);

		input = "y";
		System.out.println(firstPart + input + isWord + y);
		
	}

}

