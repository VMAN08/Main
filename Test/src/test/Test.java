package test;
import java.util.Scanner;

// This program takes user input for liters and converts it to gallons

public class Test {
	
	public static void main (String[] args) 

	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("This program converts the number of liters entered into gallons");
		System.out.println("Enter the number of liters you would like to convert to gallons. ");
		final double Liters = user_input.nextDouble();
		final double gallons = Liters * (0.264172);
		System.out.println(Liters + " liters is equal to " + gallons + " gallons.");
		

    }




}