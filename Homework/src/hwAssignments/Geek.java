package hwAssignments;
import java.util.*;

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Geek.java
//SPECIFICATION: 
//FOR: CSE-110 Assignment 6
//TIME SPENT: 1 hour
*/


public class Geek { // start of class
	
	
	String Name; // string for user's name
	static int Qcount = 0; // static int variable for number of questions asked
	
	public Geek (String name) { // Geek constructor
		
	Name = name;	
		
	}
	
	
	public String getName() { // returns name of user (Geek)
		
		return Name;
		
	}
	
	
	public static int getNumberOfQuestions() { // returns number of questions asked
		
		return Qcount;
		
	}
	
	
	public boolean allDifferent(int num1, int num2, int num3) { // method that tells if three numbers are all different or not
		
		Qcount++;
		
		if (num1 != num2 && num2 != num3 && num1 != num3) { // checks if all the numbers are different
			
			return true; // returns true for the boolean
			
		}
		
		else { // if the numbers are not different, returns false for the boolean
			
			return false;
			
		}
		
	}
	
	
	public String reverse(String text) { // method that returns the reverse of a string given
		
		Qcount++; // adds 1 to number of questions asked
		String rev = "";
		
		for (int i = text.length() - 1; i >= 0; i--) { // for loop that makes a reversed string of string given
			
			rev = rev + text.charAt(i);		
			
		}
		
		return rev; // returns reversed string
		
	}
	
	
	public int gcd(int num1, int num2) { // method that gets the GCD of two numbers
		
		Qcount++; // adds 1 to number of questions asked
		
		int gcd;
		int a = num1; // Applies value A to a in order to keep original integer separate
		int b = num2; // Applies value B to b in order to keep original integer separate
		
		
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
		
		return gcd;
		
	}
	
	
	public int countVowels(String str) { // method that returns the number of vowels in a 
		
		Qcount++; // adds 1 to number of questions asked
		int count = 0; // int to hold number of vowels
		
		for (int i = 0; i < str.length(); i++) { // for loop that checks how many vowels are in a string
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
			
			count++;
			
		}
		
		}
		
		return count; // returns number of vowels in string
		
	}
	
	
	public boolean isPalindrome(String str) { // method that returns true if a string is a palindrome
		
		Qcount++; // adds 1 to number of questions asked
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) { // for loop that makes a reverse string of the string given
			
			result += str.charAt(i);			
			
		}
		
		if (result.equals(str)) { // if the reverse string is the same as the original, return true that it is a palindrome
			
			return true; 
			
		}
		
		else { // if the reverse string is not the same as the original, return false that it is not a palindrome
			
			return false;
			
		}
		
		
	}
	
	
	
	public int digits(int num) { // method that returns number of digits in an integer
		
		Qcount++; // adds 1 to number of questions asked
		String result =	String.valueOf(num); // assigns number of digits in the number to a string variable		
		return result.length(); // returns length of result 
		
	}
	
	
	public String middle(String str) { // method that returns the middle character of a string
		Qcount++;
		
		if (str.length() % 2 == 0) { // checks if the string's length is even
			
			return (str.charAt(str.length() / 2 - 1)) + "" + (str.charAt(str.length() / 2)); // returns middle 2 characters
			
		}
		
		else { // if string's length is odd
			
			return (str.charAt(str.length() / 2) + ""); // returns middle character of string
			
		}
		
	}
	
	
	
	
	
	
	
	

}
