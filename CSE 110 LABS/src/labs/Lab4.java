package labs;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Lab4.java
//SPECIFICATION: 
//FOR: CSE-110 Lab 4
//TIME SPENT:  minutes
*/


public class Lab4 {
	
	public static void main(String[] args)
	
	{
		int i;
		int choice;
		Scanner user_input = new Scanner(System.in);
		
		do {
			
			System.out.println("Please choose your choice from the following menu: ");
			System.out.println("1) Calculate the sum of integers 1 to m.");
			System.out.println("3) Calculate the factorial of given number.");
			System.out.println("3) Find the first digit of a given number.");
			System.out.println("4) Quit.");
			choice = user_input.nextInt();
			
		
		
		
		
		switch (choice)
		{
		
		case 1:
			int m, sum = 0;
			i = 1;
			System.out.println("Enter the number: ");
			m = user_input.nextInt();
			while (i<=m) {
				sum = sum + i;
				i++;
						
			}
			
			System.out.println("The sum of the first " + m + " numbers is: " + sum + "\n");
			
			break;
		case 2:
			int n, facto = 1;
			
			break;
		case 3:
			break;
		default:
			break;
			
			


			
		}
		} while (choice != 4);			
		
	}

}
