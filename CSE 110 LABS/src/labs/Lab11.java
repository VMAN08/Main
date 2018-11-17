package labs;
import java.util.*;

//AUTHOR: Vikram Dattatri
//FILENAME: Lab11.java
//SPECIFICATION: 
//FOR: CSE 110-Lab 11
//TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/



public class Lab11 {	// public class open
	
	public static void main(String[] args) { // main method
		
		Scanner user_input = new Scanner(System.in); // scanner object created
		int numRows = 0; // int variable to hold number of rows
		int numCols = 0; // int variable to hold number of columns in the array
		int sumElements = 0; // int variable to hold the sum of each row of elements
		
		
		System.out.println("Enter the number of rows: "); // prompt for number of rows in array
		numRows = user_input.nextInt(); // stores user input into numRows variable
		
		
		System.out.println("Enter the number of columns: "); // prompt for number of columns in array
		numCols = user_input.nextInt(); // stores user input into numRows variable
		
		
		int[][] integerArray = new int[numRows][numCols]; // creates array of size according to user's input
		
		
		
		for (int i = 0; i <= numRows - 1; i++) { // for loop that goes through the rows of the array
			
			for (int j = 0; j <= numCols - 1; j++) { // nested for loop that goes through the columns of the array
				
				System.out.println("Please enter a value for position (" + i + "," + j + ")"); // prints each element position to guide user
				integerArray[i][j] = user_input.nextInt(); // sets user input as each element's value
				
			}
			
		}
		
		System.out.println(""); // blank line for space
		
		
		System.out.println("Your 2D array looks like: "); // print statement
		
		for(int i = 0; i <= numRows - 1; i++) { // for loop that goes through the rows of the array
			
			for(int j = 0; j <= numCols - 1; j++) { // nested for loop that goes through the columns of the array
				
				System.out.print(integerArray[i][j] + " "); // prints each element in the array
				
			}
			System.out.println(""); // blank line for space
		}
		
		
		
		for (int i = 0; i <= numRows - 1; i++) { // for loop going through the rows in the array
			
			sumElements = 0; // resets the sum of each rows elements to 0 before the new row's calculations
			
			
			for (int j = 0; j <= numCols - 1; j++) { // nested for loop to go through the column's in the array
				
				sumElements += integerArray[i][j]; // takes each element in the row to make the sum of the row
				
			}
			
			System.out.println("Sum of the elements of row " + i + " is: " + sumElements); // prints out the sum of each row's elements
			
		}
		
	}
	
}
