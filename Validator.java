// considered a helper class, only static no main methods
// using static in main class means i have to call it by using Validator.
// because theyre static you dont need to create an object
// known as concrete class
// you can literally copy it and use it over adn over again


import java.util.Scanner;

//this is a concrete class that can be used over and over again
//you can also add your own validation methods here
public class Validator {
	public static String getString(Scanner sc, String prompt) { // two prompts
		System.out.print(prompt); // printing out the prompt
		String s = sc.next(); // calling the next method, read user entry
		sc.nextLine(); // discard any other data entered on the line, only return the first word, if you need teh whole sentence dont use this
		return s;
	}

	public static int getInt(Scanner sc, String prompt) { // taking in scanner and prompt
		int i = 0;
		boolean isValid = false; //variable is isValid
		while (isValid == false) { // == or ! !isValid
			System.out.print(prompt); //print prompt
			if (sc.hasNextInt()) { // behaving like a dowhile loop, will run at least once
									// if the scanner has a number, then were assigning that number to i and changing the flag to true
				i = sc.nextInt();
				isValid = true;
			} else { // if it hits this condition then isValid is false
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i; // return i if given
		// if move to web application, dont use scanner, must change to actual data type (int, word etc)
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) { // allow us to look in a range
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt); // different method, getInt is overloaded verison
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max) // additional logic
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	} 

	
	public static double getDouble(Scanner sc, String prompt) { // doubles take in floating values, anything beyond decimal points
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) { //two overloaded methods
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}
	
	
	public static String getStringMatchingRegex(Scanner sc, String prompt, String regex) {
		boolean isValid = false;
		
		String input; // why declaring outside of the loop, so it can be used outside of the loop
		
		do {
			input = getString(sc, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
			}
			
		} while(isValid == false); // condition ends in ; -- !isValid(same thing)
		
		
		
		return input;
	}

	public static String getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isValid(String email, String email2) {
		// TODO Auto-generated method stub
		return false;
	}

}