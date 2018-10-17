package labs;
import java.util.*; // import java utilities

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Lab6.java
//SPECIFICATION: 
//FOR: CSE-110 Lab 6
//TIME SPENT: 1 hour 20 minutes
*/

public class Lab6 { // public class
	
	

	public static void main(String[] args) { // public class
		
		
		String firstName; // String declaration to hold first name of user
		String lastName; // String declaration to hold last name of user
		int birthYear; // int declaration to hold birth year of user
		int age;
		int currentYear = 2018;
		
		Scanner user_input = new Scanner(System.in); // initialize scanner variable
		
		
		System.out.println("Enter the first name of the person: "); // prompts user for first name
		firstName = user_input.nextLine(); // assigns user input to firstName variable
		
		System.out.println("Enter the last name of the person: ");// prompts user for last name
		lastName = user_input.nextLine(); // assigns user input to lastName variable
		
		System.out.println("Enter the birth year of the person: "); // prompts user for their birth year
		birthYear = user_input.nextInt(); // assigns user input to birthYear variable
		
		
		Person person1 = new Person(firstName, lastName, birthYear); // initializes variable of Person class
		
		firstName = person1.getFirstName(); // invokes getFirstName method on firstName variable
		lastName = person1.getLastName(); // invokes getLastName method on lastName variable
		age = person1.getAge(2018); // invokes getAge method on birthYear variable
		
		System.out.print(firstName + " " + lastName + " is " + age + " years old in " + currentYear + " and will be " + (age + 10) + " years old in ten years"); // prints out user's full name and age, along with age in ten years
		
		
		
	}
	
	
	
	
	
	

}
