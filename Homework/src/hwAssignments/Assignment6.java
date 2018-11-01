package hwAssignments;
import java.util.*;

public class Assignment6 {
	
	
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);

       String choice;
	   char command;


        // print the menu
		      printMenu();
		      Geek myGeek = new Geek("Geek");

		      do
		       {
		           // ask a user to choose a command
		           System.out.println("\nPlease enter a command or type ?");
		           choice = console.next().toLowerCase();
	               command = choice.charAt(0);

		           switch (command)
		            {
		                 case 'a':
		                      System.out.println(myGeek.getName());
		                      break;
		                 case 'b': //get total of questions asked so far
		                      System.out.println(Geek.getNumberOfQuestions());
		                      break;
		                 case 'c': //ask for 3 integers and find if there are different
							  System.out.print("Enter 3 integers: ");
							  //complete the code here
							  int numb1 = console.nextInt(); 
							  int numb2 = console.nextInt();
							  int numb3 = console.nextInt();
							  
                              if (myGeek.allDifferent(numb1, numb2, numb3) == true) { // checks to see if integers are all different or not
                            	  
                            	  System.out.println("All different");
                            	  
                              }
                              
                              else { // if numbers are not all different
                            	  
                            	  System.out.println("Not all different");
                            	  
                              }


		                      break;
		                 case 'd': // reverse the input string
							  System.out.print("Enter a string ");
							  String input = console.next();
							  System.out.println("String is reversed: " + myGeek.reverse(input));
		                      break;
		                 case 'e': //ask for 2 integers and find the GCD
                              System.out.print("Enter the first number: ");
							  int num1 = console.nextInt();
							  System.out.print("Enter the second number: ");
							  int num2 = console.nextInt();
							  int gcd = myGeek.gcd(num1, num2);
							  System.out.println("The GCD "+ num1 + " and " +num2 + " is " + gcd);
		                      break;
		                 case 'f': //ask the user for a string and find the number of vowels in the input string
                              //complete the code here
		                	 
		                	 
		                	 System.out.print("Enter a string: "); // prompts for the user to enter a string
		                	 console.nextLine();
		                	 String stri = console.nextLine();
		                	 int vowelCount = myGeek.countVowels(stri); // assigns a variable to the vowel count in the given string
		       
		                	 System.out.println("String has " + vowelCount + " vowel(s)"); // prints out number of vowels in given string

		                      break;
		                 case 'g': //find if the input string is a palindrome (reads same from left or right)
						      //Complete the code here
		                	 
		                	 
		                	 System.out.println("Enter a string: "); // prompts for the user to enter a string
		                	 console.nextLine();
		                	 String pal = console.nextLine(); 
		                	 
		                	 if (myGeek.isPalindrome(pal) == true) { // checks if given string is a palindrome
		                		 
		                		 System.out.println("Your string " + pal + " is a palindrome"); // prints out message if string is a palindrome
		                	 
		                	 }
		                	 
		                	 else {
		                		 
		                		 System.out.println("Your string " + pal + " is not a palindrome"); // prints out message if string is not a palindrome
		                		 
		                	 }

		                      break;

		                 case 'h': //ask for an integer and count the number of digits
							  System.out.print("Enter an integer: ");
						 	  num1 = console.nextInt();
						 	  System.out.println("The integer " + num1 + " has " + myGeek.digits(num1) + ".");
		                      break;

		                 case 'i'://ask for a string and return the middle string
		                 	  System.out.print("Enter a string: "); // prompts for the user to enter a string
							  input = console.next();
							  System.out.println("The middle string is " + myGeek.middle(input) + "."); // prints out middle character(s)
		                      break;
		                 case '?':
		                      printMenu(); // prints out the menu
		                      break;
		                 case 'q': 
		                      break;

		                 default:
		                       System.out.println("Invalid input");

		            }

		        } while (command != 'q');

		    }  //end of the main method


		  public static void printMenu()
		   {
		    System.out.print("\nCommand Options\n"
		                   + "-----------------------------------\n"
		                   + "a: get name\n"
		                   + "b: number of questions asked\n"
		                   + "c: all different\n"
		                   + "d: reverse\n"
		                   + "e: GCD\n"
		                   + "f: count vowels\n"
		                   + "g: is palindrome\n"
		                   + "h: number of digits\n"
		                   + "i: middle string\n"
		                   + "?: display the menu again\n"
		                   + "q: quit this program\n\n");

		    } // end of the printMenu method


}

