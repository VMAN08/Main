package hwAssignments;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Assignment3.java
//SPECIFICATION: Simple calculator that takes two operands and does with them what the user asks
//FOR: CSE-110 Assignment 3
//TIME SPENT: 45 minutes
*/


// 1a.: 11
// 1b: 4

// 2a: 3
// 2b: 2

// 3: 128

// 4: Part 1

// 0 10
// 1 9
// 2 8
// 3 7
// 4 6

// 4: Part 2

//*
//=====
//*
//====
//*
//==
//*
//=


public class Assignment3 {  //public class
	
	public static void main(String[] args)  // main method
	
	{
		
		double num1; // initializes first operand
		double num2; // initializes second operand
		double total = 0; // initializes total variable
		String select; // initialized selection that user will make
		
		Scanner user_input = new Scanner(System.in); //Scanner object
		
		System.out.println("Welcome to the calculator"); // Welcome 
		System.out.println("Enter the first operand: "); // Prompts user for input
		num1 = user_input.nextDouble(); // Applies input to first operand variable
		System.out.println("Enter the second operand: "); // Prompts for second variable
		num2 = user_input.nextDouble(); // Applies input to second operand variable
		user_input.nextLine(); // Allows for a new line of input

		
		System.out.println("\nOperations are: "); // Prints operations
		System.out.println("ADD or + for addition"); //Operations
		System.out.println("SUBTRACT or - for subtraction"); // Operations
		System.out.println("MULTIPLY or * for multiplication"); // Operations
		System.out.println("DIVIDE or / for division"); // Operations
		System.out.println("Enter your selection: "); // Operations
		
		select = user_input.nextLine().toUpperCase(); // Makes inputs to uppercase
		
		
		
		switch(select) // case statement, depending on what user inputs, does operations
		
		{
		
		case "ADD" : total = (num1 + num2);
		break;
		
		case "+" : total = (num1 + num2);
		break;
		
		case "SUBTRACT" : total = (num1 - num2);
		break;
		
		case "-" : total = (num1 - num2);
		break;
		
		case "MULTIPLY" : total = (num1 * num2);
		break;
		
		case "*" : total = (num1 * num2);
		break;
		
		case "DIVIDE" : total = (num1 / num2);
		break;
		
		case "/" : total = (num1 / num2);
		break;
		
		}
		
		System.out.print("The product is "); //Prints product
		System.out.printf("%.1f", total); // Prints total of user's operation




		
			
	}

}
