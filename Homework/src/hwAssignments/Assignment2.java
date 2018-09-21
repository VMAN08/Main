package hwAssignments;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Assignment2.java
//SPECIFICATION: Compares two strings entered by user in various ways
//FOR: CSE-110 Assignment 2
//TIME SPENT: 35 minutes
*/

/*Answers to the Written Exercises
 * 1. 
 * a. System.out.println(myString.length());
 * b. System.out.println(myString.indexOf("birthday");
 * c. System.out.println(myString.substring(4,15);
 * 
 * 
 * 1. a. false
 * b. true
 * c. true
 * d. true
 * 
 * 
 * 3. 
 * switch (letter)
{

case 'A', 'a' : System.out.println("Excellent"); break;
case 'B', 'b' : System.out.println("You can do better"); break;
case 'C', 'c' : System.out.println("Try harder"); break;
case 'D', 'd' : System.out.println("Try much harder"); break;
default : System.out.println("Try another major! ");

}
 * 
 */



public class Assignment2 { //public class
	
	public static void main(String[] args) //main method
	{
		
		String input_1; //String for first input
		String input_2; //String for second input
		Scanner user_input = new Scanner(System.in); // Scanner object for user's input
		
		System.out.println("Please enter a string: "); //Prompts for string from user
		input_1 = user_input.nextLine(); // Declares string entered as a variable
		
		System.out.println("Please enter another string: "); //Prompts for string
		input_2 = user_input.nextLine(); //Declares string entered as variable
		
		String lastLetter_1 = (input_1.substring(input_1.length() - 1)); //Declares variable to hold last letter of string 
		String lastLetter_2 = (input_2.substring(input_2.length() - 1)); //Declares variable to hold last letter of string

		
		if (input_1.length() % 2 == 0) //If statement to check if length is odd or even
		{
			
			System.out.println("The first string's length is even"); // prints the first string's length is even
			
		}
		
		else //else statement to print out if string's length is odd
		{
			
			System.out.println("The first string's length is odd"); // prints the first string's length is odd
			
		}
		
		
		if (input_2.length() % 2 == 0) //if statement for second string's length to see if odd or even
		{
			
			System.out.println("The second string's length is even"); // prints the second string's length is even
			
		}
		
		else //second string's else statement to print if odd
		{
			
			System.out.println("The second string's length is odd"); // prints the second string's length is odd
			
		}
		
		if (input_1.equals(input_2)) //if statement if the two strings are not the same
		{
		
			System.out.println("The two strings are the same."); // prints the two strings are the same
			
		}
		
		else //else statement if the two strings are not the same
		{
		
			System.out.println("The two strings are different."); // prints the two strings are different
			
		}
		
		if (input_1.compareTo(input_2) > 0) //checks lexical size of strings
		{
		
			System.out.println("The first string is lexically larger."); // prints that the first string is lexically larger
			
		}
		
		else if (input_1.compareTo(input_2) == 0) //checks lexical size of strings with compareTo
		{
		
			System.out.println("The two strings are lexically equal"); // prints that the two strings are lexically equal
			
		}
		
		else if (input_1.compareTo(input_2) < 0 ) //checks lexical size of strings
		{
		
			System.out.println("The second string is lexically larger"); // prints that the second string is lexically larger
			
		}
		
		System.out.println("The last character of the first string is: " + lastLetter_1.toUpperCase()); //Prints last letter of string in upper case
		System.out.println("The last character of the second string is: " + lastLetter_2.toUpperCase()); //prints last letter of second string in upper case

		System.out.println("The concatenation of the two strings is: \"" + input_1.toUpperCase() + input_2.toUpperCase() + "\""); // Prints the concatenation of the two string uppercase in between quotes
		
		System.out.println("The first string using lowercase letters: " + input_1.toLowerCase()); // Prints the first string in lower case
		System.out.println("The second string using lowercase letters: " + input_2.toLowerCase()); // Prints the second string in lower case

	
	}

		
	}
	


