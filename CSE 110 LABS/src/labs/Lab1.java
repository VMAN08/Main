package labs;
import java.util.Scanner;

/*-----------------------------------------------------------
//AUTHOR: Vikram Dattatri
//FILENAME: Lab1.java
//SPECIFICATION: Takes three test scores from user input and outputs the average score
//FOR: CSE-110 Lab #1
//TIME SPENT: 20 minutes

------------------------------------------------------------*/
// This program takes the input of three integers and applies them to three variables


public class Lab1

{
	
	public static void main(String[] args)
	
	{
		Scanner user_input = new Scanner(System.in); //Scanner class, assigns a name to call a new Scanner
		
		int test1; //Integer to hold test score that user inputs 
		int test2;
		int test3;
		int NUM_TESTS = 3; //Assigns the number of tests, which is 3, to a constant
		double avgScore; //Creates a variable of type double to hold the average of the three tests
		
		System.out.println("Enter the score on the first test: "); // Asks user for test score
		test1 = user_input.nextInt(); // reads the next integer input by the user
		System.out.println("Enter the score on the second test: "); //Asks user for the second test score
		test2 = user_input.nextInt();
		System.out.println("Enter the score on the third test: "); //Asks user for the third test score
		test3 = user_input.nextInt();
		
	    avgScore = (test1 + test2 + test3) / (double) NUM_TESTS; //Applies the average to a variable avgScore
		System.out.println("Your average score is: " + avgScore); //Prints out average score
		
	
	}
	
	
	

}
