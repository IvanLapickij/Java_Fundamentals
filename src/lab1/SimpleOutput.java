package lab1;

public class SimpleOutput {

	public static void main(String[] args) {
		System.out.println("a. Hello World");
		
		System.out.println("b. Ivan");
		
		String name = "Ivan";
		System.out.println("c. " + name);
		
		String address = "address";
		System.out.println("d. " + address);
		
		// is this right?
		System.out.println("e. " + "2000");

		int yearSydneyOlympics = 2000;
		String city = "Sydney";
		System.out.println("f. Year of Olympics were held in " +city + yearSydneyOlympics);

		// is this right?
		String nameOutput = "My name is " + name;
		System.out.println("g. " + nameOutput);
		
		System.out.println("h. " + nameOutput);
		
		String yearSydneyOlympicsOutput = "i. The Sydney Olympics were held in " + yearSydneyOlympics;
		System.out.println(yearSydneyOlympicsOutput);
		
		System.out.println("j. " + yearSydneyOlympicsOutput);
		
		int sum = 3+2;
		System.out.println("k. Sum is: " + sum);
		
		int a = 2;
		int b = 3;
		
		sum = a + b;
		
		System.out.println("l. Sum "+a+" and "+b+" is "+sum);
	}

}
