package labs;
import java.util.*;

/*-----------------------------------------------------------
//AUTHOR: Vikram Dattatri
//FILENAME: Lab2.java
//SPECIFICATION: 
//FOR: CSE-110 Lab #2
//TIME SPENT: 35 minutes

------------------------------------------------------------*/


public class Lab2 { //Public class
	
	public static void main(String[] args) //Program's main method
	
	{
		String firstName; //Declares object of type String to hold user's first name
		String lastName;  //Declares object of type String to hold user's last name
		String fullName;  //Declares object of type String to hold user's full name
		int nameLength;   //Declares object of type integer to hold the length of user's name
		Scanner user_input = new Scanner(System.in); //Declares new Scanner object for later use
		
		System.out.println("Pleaes enter your first name: "); //Prompts for user's first name
		firstName = user_input.nextLine(); //Assigns user's input as firstName variable
		
		System.out.println("Plese enter your last name: "); //Prompts for user's last name
		lastName = user_input.nextLine(); //Assigns user's input as lastName variable
		
		fullName = (firstName + " " + lastName); //Concatenates user's first and last name together, separated with a space
		fullName = fullName.toUpperCase(); //Converts user's full name to upper case characters
		
		nameLength = fullName.length(); //Assigns the nameLength variable to the length of user's full name
		
		System.out.println("Full name (in capitals): " + fullName); //Prints out user's full name, now upper case
		System.out.println("Length of full name: " + nameLength); // Prints out the length of user's full name
		
		
		String test1 = new String("CSE110"); //Declares new variable of type String called test1
		String test2 = "CSE110"; // Declares new variable of type String called test2, and assigns a string to its value
		
		
		if ( test1 == test2 ) // if loop using == sign, comparing test1 and test2
		{
			
			System.out.println("String comparison usingh == sign works"); //Prints out that == sign works, if called upon
			
		}
		
		else 
		{
			System.out.println("String comparison using \"==\" sign does NOT work"); //Prints out that == sign does not work, if called upon
			
			
		}
		
		if ( test1.equals(test2)) //if loop comparing test1 and test2 using .equals method
		{
			
			System.out.println("String comparison using \"equals\" method works"); //Prints our that .equals method works, if called upon

		}
		
		else
		{
			
			System.out.println("String comparison using \"equals\" method does NOT work"); //Prints out that .equals method does not work, if called upon 
			
		}
		
		
	}

}
