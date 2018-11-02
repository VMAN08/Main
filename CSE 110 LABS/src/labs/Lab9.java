package labs;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Lab9.java
//SPECIFICATION: 
//FOR: CSE-110 Lab 9
//TIME SPENT: 20 minutes
*/


public class Lab9 { // public class
	
	public static void main(String[] args) { // main method
		
		int arraySize; // integer variable to hold size of array
		double currentElement; // double variable to hold the value of each element within the loop
		double sumOfElements = 0; // double value to hold the sum of all the elements in the array
		Scanner user_input = new Scanner(System.in); // creates scanner object
		
		
		System.out.println("How many elements in the array? "); // prompts user for number of elements in the array
		arraySize = user_input.nextInt(); // makes arraySize variable the user's array size
		
		
		double[] integerArray = new double[arraySize]; // initializes array with size that user requested
		
		
		for(int i = 0; i <= arraySize - 1; i++) { // for loop that enters each given value into the array
			
			System.out.println("Please enter the next value: "); // prompts for input for next array element
			currentElement = user_input.nextDouble(); // currentElement variable set to what user inputs
			integerArray[i] = currentElement; // sets current element in the array to user's input
		}
		
		
		for (int i = 0; i <= arraySize - 1; i++) { // for loop that adds all of the elements of the array and prints them out
			
			sumOfElements += integerArray[i]; // adds every element in the array to the sumOfElements variable
			System.out.print(integerArray[i] + " "); // prints out each element in the array
		}
		
		System.out.println("\nThe sum of the array's elements is: " + sumOfElements); // Prints out the sum of the elements in the array
		
	}

}
