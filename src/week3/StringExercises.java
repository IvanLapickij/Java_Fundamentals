package week3;

import java.util.Scanner;

public class StringExercises {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Calling methods to demonstrate their functionality
		
		System.out.println("###stringFormattingExercise###");
		stringFormattingExercise();
		
		System.out.println();
		System.out.println("###stringComparisonsExercise###");
		stringComparisonsExercise();
		
		System.out.println();
		System.out.println("###stringConstantPoolExercise###");
		stringConstantPoolExercise();
		
		stringMethodsExercise();
	
	}
	/*	1 - Write a method to perform the following operations 
	 * on a given string:	"JavaProgramming".*/
	private static void stringFormattingExercise() {
		
		String str1 = "JavaProgramming";
		char char5 = str1.charAt(5);
		String subString = str1.substring(4, 9);
		String uppercase = str1.toUpperCase();
		boolean contains = str1.contains("Prog");
		String replacedString = str1.replace("Java", "Python");
		
		//1.	Find and print the length of the string.
		System.out.println("Length: " + str1.length());
		//2.	Print the character at index 5.
		System.out.println("Character at index 5: " + char5 );
		//3.	Extract and print the substring from index 4 to 9.
		System.out.println("Substring from index 4 to 9: " + subString );
		//4.	Convert the string to uppercase and print it.
		System.out.println("Uppercase: " + uppercase);
		//5.	Check if the string contains the substring "Prog" and print the result.
		System.out.println("Contains 'Prog': " + contains);
		//6.	Replace the substring "Java" with "Python" and print the new string.
		System.out.println("Replaced string: " + replacedString);
		
	}

	/* 2 - Write a method to demonstrate the concept of the string constant pool.
	 * Create two strings using string literals and two strings using the new keyword
	 * Compare them using the == operator and the equals method and print the results
	*/
	private static void stringComparisonsExercise() {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String(str2);
		String str4 = new String(str1);
				
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 == str3: " + (str1 == str3));
		System.out.println("str3 == str4: " + (str3 == str4));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		System.out.println("str1.equals(str4): " + str1.equals(str4));
		
	}

	/* 3 - Write a method to compare two strings lexicographically.
	 * Prompt the user to input two strings, then compare them using compareTo,
	 * equals, and equalsIgnoreCase methods. Print the results of each comparison.
	*/
	private static void stringConstantPoolExercise() {
		
		boolean stringEquals = false;
		boolean ingnoringCase = false;
		
		String str1 = sc.next();
		System.out.print("Enter the first string: ");
		System.out.println();
		String str2 = sc.next();
		System.out.print("Enter the second string: ");
		
		if(str1.equalsIgnoreCase(str2)) {
			stringEquals=true;
			System.out.println("The string are equal ingonirng case: " + ingnoringCase);
			}else {
				System.out.println("The string are equal ingonirng case: " + ingnoringCase);
			}
		if(str1.equals(str2)) {
			stringEquals=true;
			System.out.println("The string are equal using equals: " + stringEquals);
		}else {
			System.out.println("The string are equal using equals: " + stringEquals);

		}
		
		
		//System.out.println("The first string is lexicographically less than the second string.");
	}

	private static void stringMethodsExercise() {
		// TODO Auto-generated method stub
		
	}

}
