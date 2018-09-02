package hwAssignments;
import java.util.Scanner;

/*
// AUTHOR: Vikram Dattatri
// FILENAME: Assignment1.java
// SPECIFICATION: This program takes the user's name and height and converts it from feet to meters
// FOR: CSE-110 Assignment 1
// TIME SPENT: 20 minutes
*/

/*Answers to the Written Exercises
 * 1. The value of mystery will be 2
 * 
 * 2. a. 10
 * 	  b. 1
 *    c. 27
 *    d. 27.5
 *    e. 27
 *    f. 28
 * 
 * 3.
 *  Scanner user_input = new Scanner(System.in);
 *  System.out.println("Please provide your full name: ");
 *  String name = user_input.nextLine();
 */


public class Assignment1 
{
	
	public static void main(String[] args)
	{
	
		Scanner user_input = new Scanner(System.in);  //Declares scanner object called user_input
		String name;  //Declares object of type String called name, used to store user's name
		int height_feet;   //Integer to store height in feet of user
		int height_inches; //Integer to store height in inches of user
		double height_meters; //variable of type double used to store the user's height in meters
		
		
		System.out.println("What is your name: ");  //Prompt for user to enter name
		name = user_input.nextLine();  // Defines object name as whatever string the user enters next
		System.out.println("What is your height?");   //Prompt to enter height
		System.out.println("Feet: ");  //Prompt to enter height in feet
		height_feet = user_input.nextInt();  //Reads input and stores it in height_feet
		System.out.println("Inches: ");  //Prompt to enter height in inches
		height_inches = user_input.nextInt();  //Reads input and stores it in height_inches
		
		height_meters = ((height_feet*12) + height_inches) * 2.54/100; // height_meters defined as result of conversion algorithm 
		
		System.out.println(name + ", your height in meters is " + height_meters); //Prints out final height of user in meters
		
		
	}

}
