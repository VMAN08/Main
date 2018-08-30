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
	
		Scanner user_input = new Scanner(System.in);
		String name;
		int height_feet;
		int height_inches;
		double height_meters;
		
		
		System.out.println("What is your name: ");
		name = user_input.nextLine();
		System.out.println("What is your height?");
		System.out.println("Feet: ");
		height_feet = user_input.nextInt();
		System.out.println("Inches: ");
		height_inches = user_input.nextInt();
		
		height_meters = ((height_feet*12) + height_inches) * 2.54/100;
		
		System.out.println(name + ", your height in meters is " + height_meters);
		
		
	}

}
