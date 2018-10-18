package hwAssignments;
import java.util.*;


public class Shape { // public class
	
	
	int side1; // declare side1 local variable (same for other 3)
	int side2;
	int side3;
	int side4;
	
	
	public Shape(int s1, int s2, int s3, int s4) { // Constructor with parameters
		
		side1 = s1; // makes local variable equal to the sides given in shape (same for other 3)
		side2 = s2;
		side3 = s3;
		side4 = s4;
		
	}
	
	private int longest() { // private method to find longest side
		
		int result = 0; // initializes local int result to return after method finishes
				
		if (side1 >= side2 && side1 >= side3 && side1 >= side4) { // checks if side1 is the longest
			
			result = side1; // sets side1 as the result of the method
			
		}
		
		else if (side2 >= side1 && side2 >= side3 && side2 >= side4) { // checks if side2 is the longest
			
			result = side2; // sets side2 as the result of the method
			
		}
		
		else if (side3 >= side1 && side3 >= side2 && side3 >= side4) { // checks is side3 is the longest
			
			result = side3; // sets side3 as the result of the method
			
		}
		
		else if (side4 >= side1 && side4 >= side2 && side4 >= side3) { // checks if side4 is the longest
			
			result = side4; // sets side4 as the result of the method
			
		}
		
		else { // if all the sides are the same
			
			result = side1; // sets one of the sides as the result if all are the same
			
		}
		
		return result; // returns the result of the method
		
		
	}
	
	
	
	private int shortest() { // method that gets the shortest side
		
		
		int result = 0; // sets a local integer to hold the result of the method
		
		if (side1 <= side2 && side1 <= side3 && side1 <= side4) { // checks if side1 is the shortest
			
			result = side1; // sets side1 as the result of the method
			
		}
		
		else if (side2 <= side1 && side2 <= side3 && side2 <= side4) { // checks if side2 is the shortest
			
			result = side2; // sets side2 as the result of the method 
			
		}
		
		else if (side3 <= side1 && side3 <= side2 && side3 <= side4) { // checks if side3 is the shortest
			
			result = side3; // sets side3 as the result of the method
			
		}
		
		else if (side4 <= side1 && side4 <= side2 && side4 <= side3) { // checks if side4 is the shortest
			
			result = side4; // sets side4 as the result of the method
			
		}
		
		else { // if all sides are the same length
			
			result = side1; // sets any one side as the result of the method if they are all the same
			
		}
		
		return result; // returns the result of the method
		
		
	}
	
	
	
	public boolean isSquare() { // method that checks if the shape is a square
		
		boolean result; // declares a local boolean to hold the result of the method
		
		if (side1 == side2 && side1 == side3 && side1 == side4) { // checks if all the sides are the same
			
			result = true; // sets boolean as true if all the sides are the same, since shape is a square
			
		}
		
		else { // if all the sides are not the same
			
			result = false; // sets boolean as false, since shape is not a square
			
		}
		
		return result; // returns result of the method
		
	}
	
	
	public boolean isRectangle() { // method that checks if shape is a rectangle
		
		boolean result; // declares boolean to hold result of the method
		
		if (side1 == side2 && side3 == side4) { // checks if there are two pairs of sides
			
			result = true; // sets result boolean as  true, as the shape is a rectangle
			
		}
		
		else if (side1 == side3 && side2 == side4) { // checks if there are two pairs of sides
			
			result = true; // sets result boolean as true, as the shape is a rectangle
			
		}
		
		else if (side1 == side4 && side2 == side3) { // checks if there are two pairs of sides
			
			result = true; // sets result boolean as true, as the shape is a rectangle
			
		}
		
		else { // if the shape is not a rectangle
			
			result = false; // sets boolean as false, as the shape is not a rectangle
			
		}
		
		return result; // returns result of method
		
		
		
	}
	
	
	public boolean differentSides() { // method that checks if all the sides are different or not
		
		
        boolean result; // declares boolean variable to hold result of the method
		
		
	    if (side1 != side2 && side3 != side4 && side1 != side3 && side2 != side4 && side1 != side4 && side2 != side3) { // checks if all the sides are different from each other
			
			result = true; // sets result boolean as true if all the sides are different from each other
			
		}
		
		
		else { // if all the sides are not different
			
			result = false; // sets the result boolean as false since all the sides are not different
			
		}
		
		return result; // returns result of the method
			
		
	}
	
	
	public int findPerimeter() { // method that finds the perimeter of the shape
		
		int result = side1 + side2 + side3 + side4; // adds all the sides together to get the perimeter
        return result; // returns the perimeter of the shape
	
	}
	
	
	public int findArea() { // method that finds the area of the shape
		
		int result; // declares local result variable to hold the area
		
		result = longest() * shortest(); // takes the product of the shortest and longest sides to get the area
		
		return result; // returns the area of the shape
		
	}
	
	
	public int getSide1() { // method that returns side1
		
		return side1; // returns side1
		
	}
	
	
    public int getSide2() { // method that returns side2
		
		return side2; // returns side2
		
	}	


    public int getSide3() { // method that returns side3
		
		return side3; // returns side3
		
	}
    
    
    public int getSide4() { // method that returns side4
		
		return side4; // returns side4
		
	}
    
    
    public void setSide1(int s) { // method that Sets side1 as given value
    	
    	side1 = s; // sets side1 as given value
    	
    }
    
    
    public void setSide2(int s) { // method that sets side2 as given value
    	
    	side2 = s; // sets side2 as given value
    	
    }
    
    
    public void setSide3(int s) { // method that sets side3 as given value
    	
    	side3 = s; // sets side3 as given value
    	
    }
    
    
    public void setSide4(int s) { // method that sets side4 as given value
    	
    	side4 = s; // sets side4 as given value
    	
    }
    
    
    public String toString() { // method that prints out all the sides as type string
    	
    	Integer.toString(side1); // converts side to type string
    	Integer.toString(side2); // converts side to type string
    	Integer.toString(side3); // converts side to type string
    	Integer.toString(side4); // converts side to type string

    	String result = (side1 + ":" + side2 + ":" + side3 + ":" + side4); // sets result variable as sides printed out
    	
    	return result; // returns sides printed out
    	
    }
    
    
		
		
		
}
	
	


