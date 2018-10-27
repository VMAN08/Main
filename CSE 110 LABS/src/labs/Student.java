package labs;
import java.util.*; // imports java utilities

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Student.java
//SPECIFICATION: 
//FOR: CSE-110 Lab 8
//TIME SPENT: 
*/


public class Student { // public class 

	private String studentMajor; // private string variale that holds student's major
	private int studentCredits; // private int variable that holds the student's credits
	private int studentPoints; // private int variable that holds the student's points
	private String firstName; // private string variable to hold student's first name
	private String lastName; // private string variable to hold student's last name
	
	
	
	public Student(String fName, String lName) { // constructor 1 to hold student with only name given
		
		firstName = fName; // sets name given to variable
		lastName = lName; // sets name given to variable
		
		this.studentMajor = "General Studies"; // sets major for student 1
		this.studentPoints = 0; // sets points for student 1
		this.studentCredits = 0; // sets points for student 1
		
		
	}
	
	
	public Student(String major, int credits, int points, String fName, String lName) { // constructor for student with all info provided
		
		this.studentMajor = major; // sets major for student 2
		this.studentCredits = credits; // sets credits for student 2
		this.studentPoints = points; // sets points for student 2
		firstName = fName; // sets first name for student 2
		lastName = lName; // sets last name for student 2
		
		
	}
	
	
	public String getMajor() { // this method returns the major of a student
		
		return studentMajor; // returns student's major
		
	}
	
	
	public int getGradePoints() { // this method returns the points of a student
		
		return studentPoints; // returns points
		
	}
	
	
	public int getCredits() { // this method returns the credits of a student
		
		return studentCredits; // returns credits
		
	}
	
	
	public String getFullName() { // this method returns the full name of a student 
		
		return firstName + " " + lastName; // returns both the first and last name of a student
		
	}
	
	
	public void changeMajor(String newMajor) { // this method changes the major of a student
		
		studentMajor = newMajor; // sets the major of the student to the new major provided
		
	}
	
	
	public void loopHelper(int start, int end, int incBy) { // this method shows the sum of a range of numbers incremented by a given amount
		
		int result = 0; // result that will eventually be returned
		System.out.println("\nIterate from " + start + " till " + end + " with " + incBy + " steps and find sum \n"); // prints out what range of numbers will be added up and by what increment
		
		for(int i = start; i <= end; i += incBy ) { // for loop that calculates the sum of the range of numbers and each number
			
			result += i; // result is equal to result plus i, which is every number in the sequence as it goes
			System.out.print(i + " "); // prints out each number in the sequence
			
		}
		
		System.out.print("\nSum is " + result + "\n");	// prints out the sum of the range of numbers
		
		
	}
	
	
	
	
}

	

