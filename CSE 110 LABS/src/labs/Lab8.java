package labs;
import java.util.*; // imports java utilities

/*
//AUTHOR: Vikram Dattatri
//FILENAME: Lab8.java
//SPECIFICATION: 
//FOR: CSE-110 Lab 8
//TIME SPENT: 
*/

public class Lab8 { // public class
	
	
	public static void main(String[] args) { // main method
		
		String firstName; // string variable that holds a student's first name
		String lastName; // string variable that holds a student's last name
		String studentMajor; // string variable that holds a student's major
		int studentPoints; // int variable that holds a student's points
		int studentCredits; // int variable that holds a students's credits
		
		Scanner user_input = new Scanner(System.in); // creates new Scanner object
		
		System.out.println("ENTER FIRST STUDENT INFORMATIONS"); // prints header
		System.out.println("Enter first name: "); // prompts for student's first name
		firstName = user_input.nextLine(); // takes first name and assigns it to firstName variable
		
		System.out.println("Enter last name: "); // prompts for student's last name
		lastName = user_input.nextLine(); // takes last name and assigns it to lastName variable
		System.out.println("FIRST STUDENT INFORMATIONS \n"); // prints header

		
		Student s1 = new Student(firstName, lastName); // creates new Student object 
		
		
		System.out.println("The name of the student is: " + s1.getFullName()); // prints out the full name of student1
		System.out.println("Major is: " + s1.getMajor()); // prints out the major of student1
		System.out.println("The student's number of points is: " + s1.getGradePoints()); // prints out the grade points of student1
		System.out.println("Number of earned credits is: " + s1.getCredits()); // prints out the credits of student1
		
		
		System.out.println("ENTER SECOND STUDENT INFORMATIONS"); // prints header
		System.out.println("Enter first name: "); // prompts for student's first name
		firstName = user_input.nextLine(); // takes first name and assigns it to firstName variable
		
		System.out.println("Enter the last name: "); // prompts for last name
		lastName = user_input.nextLine(); // takes last name and assigns it to lastName variable
		
		System.out.println("Enter your major: "); // prompts for major
		studentMajor = user_input.nextLine(); // takes major and assigns it to studentMajor variable
		
		System.out.println("Enter your grade points is: "); // prompts for grade points
		studentPoints = user_input.nextInt(); // takes grade points and assigns it to studentPoints variable
		
		System.out.println("Enter your total credits: "); // prompts for credits
		studentCredits = user_input.nextInt(); // takes credits and assigns it to studentCredits variable
		
		
		Student s2 = new Student(studentMajor, studentCredits, studentPoints, firstName, lastName); // creates new Student object
		
		System.out.println("SECOND STUDENT INFORMATIONS \n"); // prints header
		System.out.println("The name of the student is: " + s2.getFullName()); // prints out the full name of student 2
		System.out.println("Major is: " + s2.getMajor()); // prints out the major of student 2
		System.out.println("The student's number of points: " + s2.getGradePoints()); // prints out the grade points of student 2
		System.out.println("Number of earned credits is: " + s2.getCredits() + "\n"); // prints out the credits of student 2
		
		s2.changeMajor("International Affairs"); // changes the major of student 2 using the changeMajor method
		System.out.println(s2.getFullName() + " has changed majors to " + s2.getMajor() + "\n"); // prints out that the student has changed major to the new major
		
		
		System.out.println("STUDENT HELPER FUNCTIONS"); // prints header
        s1.loopHelper(1, 30, 3); // runs loopHelper method with these parameters
        s1.loopHelper(5, 28, 2); // runs loopHelper method with these parameters
		
		
		
	}
	

}
