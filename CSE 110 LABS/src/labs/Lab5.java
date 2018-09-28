package labs;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Lab5.java
//SPECIFICATION: Prints range of numbers with parameters from user and/or prints a right triangle with stars 
//FOR: CSE-110 Lab 5
//TIME SPENT: 45 minutes
*/

public class Lab5 {  //public class
	
	public static void main(String[] args) { // Main method
		
	
	Scanner user_input = new Scanner(System.in); // Initialize scanner variable
	int choice; // initialize integer to hold user's choice
	
	do { // do while loop holding switch statement and nested for loop
		
		System.out.println("Please choose your choice from the following menu: "); //Prompts user for input
		System.out.println("1) Print through all integer numbers between two given integers. "); //Option 1
		System.out.println("2) Display a right triangular pattern of stars. "); // Option 2
		System.out.println("3) Quit. "); // Option 3 (Quit)
	    choice = user_input.nextInt(); // Defines choice as the input of the user
        
	    
	    switch (choice) { // Switch statement depending on user's choice
      
        
        case 1: // Case 1
        
			
			int start = 0; // Initialize start variable
			int end = 0; // Initialize end variable
			
			System.out.print("Please enter the start number: "); // Prompts user for starting number
			start = user_input.nextInt(); // Defines start as number user enters
			System.out.print("Please enter the end number: "); // Prompts user for ending number
			end = user_input.nextInt(); // Defines end as number user enters
			
			for (int i = start; i<= end; i++) { // for loop that prints out range of numbers
				
				System.out.print(i + " "); // Prints range of numbers
			}
			
			System.out.println(); // Gives a line of space after the loop ends
			
			break;
		
			
		case 2: // Case 2
			
			int height = 0; // Variable holding height of right triangle
			System.out.println("Enter the height of the right triangle: "); // Prompts user for height of right triangle
			height = user_input.nextInt(); // Defines height variable as height that user enters
			
			for (int i = 1; i <= height; i++) { // Nested for loop that prints out right triangle of stars
			
								
				for (int j = 1; j <= i; j++) { // Prints out columns
					
					System.out.print("*"); // Prints a star
					
				}
				
				System.out.println(); // Gives a line of space after inner for loop executes so that a new row is made
				
			}
			
			
			break;
			
			}
	    
	    
	   
			

	    
	}
	
		while (choice !=3); // Termination statement, if user selects option 3 to quit program

	 
	
	
	
	
	
	
	


	
	

	
		
	
	

	
	
	
	
	
	
	
	
	
	
}
	
}
