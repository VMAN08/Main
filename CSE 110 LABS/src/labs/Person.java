package labs;
import java.util.Scanner; // import java utilities


public class Person { // public class
	
	
	
	String firstName; // initializes a firstName variable of String type
	String lastName; // initializes a lastName variable of String type
	int birthYear; // initializes a birthYear variable of int type

	
	public Person(String fName, String lName, int bYear) { // class Person constructor with parameters
		
		firstName = fName;
		lastName = lName;
		birthYear = bYear;
		
		
	}
	
	
	public String getFirstName() { // method getFirstName to get first name of user
		
		
		return this.firstName; // returns first name of user
		
		
	}
	
	
	public String getLastName() { // method getLast name to get last name of user
		
		return this.lastName; // returns last name of user
		
	}
	
	
	public int getAge(int currentYear) { // method getAge to get the age of user
		
		int age = currentYear - birthYear; // calculates the user's age
		return age; // returns the user's age
		
		
	}
	

	}


