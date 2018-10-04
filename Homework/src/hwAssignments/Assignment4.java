package hwAssignments;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Assignment4.java
//SPECIFICATION: 
//FOR: CSE-110 Assignment 4
//TIME SPENT: 2 hours and 40 minutes
*/



// PART 1

/* 1a) 

i is : 5
i is : 4
i is : 3
i is : 2
i is : 1
i is : 0


1b) 


int i = 5;

while (i >= 0){

      System.out.println("i is : " + i);
      i--;

}




2) 

*****
#####
*****
#####



3)

* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 





c) 


int num;
		
		Scanner user_input = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter a number: ");
			num = user_input.nextInt();
			
			
		}while (num < 0 || num > 100);




*/





public class Assignment4 { // public class
	
	
		
		
	
	
	public static void main(String[] args) { // main method
		char choice; // variable of type character
		int gcd; // variable of type int to hold the gcd
		Scanner user_input = new Scanner(System.in); // Initializes scanner variable
		System.out.println("Command Options"); // Displays text
		System.out.println("---------------------------"); // Displays text
		System.out.println("a: Find Greatest Common Divisor (gcd)"); // Displays first option
		System.out.println("b: Find Max, Min, & Average"); // Displays second option
		System.out.println("?: Display"); // Displays third option
		System.out.println("q: Quit"); // Displays final option to quit
		
	
		
		
		
		do { // do loop containing full switch statement with all menu options
			 
			System.out.println(""); // blank line for neatness
			System.out.println("Please enter a command or type? "); // Prompts user for command
			choice = user_input.next().charAt(0); // applies given character to choice variable
			
			
			
			
			switch (choice) { // switch statement containing all four menu options
			
			case 'a': // first option
				
				
				
				System.out.println("Enter the first integer: "); // Prompts for first integer for gcd
				int A = user_input.nextInt(); // Applies integer to A variable
				System.out.println("Enter the second integer: "); // Prompts for second integer for gcd
				int B = user_input.nextInt(); // Applies integer to B variable
				
				int a = A; // Applies value A to a in order to keep original integer separate
				int b = B; // Applies value B to b in order to keep original integer separate
				
				
				if (a == 0) { // if loop for if a is equal 0
					
					gcd = b; // if a is equal to 0, b is automatically the gcd
					
				}
				
				while (b != 0) { // while loop that runs as long as b is not equal to 0
					
					if (a > b) { // if loop containing statement if a is larger than b
						
						a = a - b; // if a is larger than b, b must be subtracted from a
						
					}
					
					else { // else statement, so when b is larger than a
						
						b = b - a; // when b is larger than a, a must be subtracted from b
					}
				}
				
				gcd = a; // when gcd is going to be a, the while loop completes and then applies its value here
				
				System.out.println("The gcd of " + A + " and " + B + " is: " + gcd); // prints out gcd of the two given numbers
				
				System.out.println(""); // blank line for neatness
				
				break; // ends first case 
				
			case 'b': // second option
				
				int num; // integer to hold each number input by the user
			    int smallest = 0; // integer to hold smallest number
			    int largest = 0; // integer to hold largest number
			    int sum = 0; // integer to hold the sum of all numbers input
			    int count = 0; // integer to hold the count of how many numbers are input
			    double avg = 0.0; // double variable to hold the average of all the numbers
				
				System.out.println("Enter a sequence of integers: "); // prompts the user for a sequence of integers
				    num = user_input.nextInt(); // applies number given to num variable
				    
				    smallest = num; // applies number given to largest variable before check
				    largest = num; // applies number given to largest variable before check
				    
				    
				    
				    do { // do loop containing loop to sort the smallest and largest numbers, and calculate sum and average
				    	
				    	count++; // increases count by one
				    	sum += num; // sum is equal to sum plus num variable
				    	num = user_input.nextInt(); // next integer is applied to num variable
				    	
				    	avg = (double)sum/count; // average is typecast from type integer to double
				    	
				    	if (num != 0) { // if loop if num is not equal to 0
				    		
				    		if (num > largest) { // if loop to determine if num is the largest number input so far
				    			
				    			largest = num; // applies num's value to largest 
				    			
				    		}
				    		
				    		else if (num < smallest) { // else if statement when num variable is smaller than smallest
				    			
				    			smallest = num; // num's value is applied to the smallest variable
				    			
				    		}
				    		
				    	}
				    	
				    	
				    } while (num != 0); // while statement to terminate loop and stop input of integers when 0 is entered
				    
				    
				    
				    
				   
				    
				    System.out.println(""); // blank line for neatness
				    System.out.println("Largest: " + largest); // prints out largest number
				    System.out.println("Smallest: " + smallest); // prints out smallest number
				    System.out.println("Sum is: " + sum); // prints out the sum of all numbers input
				    System.out.print("Average is: "); // prints out the average of all numbers input
				    System.out.printf("%.2f", avg); // formats average variable to only two decimal places
				    System.out.println(""); // blank line for neatness
				
				
				
				break; // end of case 2
				
				
			case '?': // third option
				
				System.out.println("Command Options"); // Reprints menu of options
				System.out.println("---------------------------"); // reprint 
				System.out.println("a: find gcd"); // reprint of first option. finding the gcd
				System.out.println("b: find max, min, & average"); // reprint of second option for max. min, and average
				System.out.println("?: Display"); // reprint of third option, to display menu
				System.out.println("q: Quit"); // reprint of quit option
				
				
				
				
				
						
				
			
			
			}
			
			
			
			
			
			
			
		}
			
			
			
			
			
			
		
		
		
		while (choice != 'q'); // while statement to terminate original do loop if 'q' is entered to quit
		

	
	
	}
	
}
