package hwAssignments;
import java.util.*;

public class Assignment5 {
   public static void main (String[] args) {

       	Scanner console = new Scanner (System.in);

       	String choice;
	   	char command;
	   	int num1, num2, num3, num4;
        // print the menu
		printMenu();
		System.out.println("Enter the sides of the quadrilaterals: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		num3 = console.nextInt();
		num4 = console.nextInt();
        //instantiate a new object of type Shape
        Shape shape1 = new Shape (num1, num2, num3, num4);

		 do
		 {
		      // ask a user to choose a command
		    	System.out.println("\nPlease enter a command or type ?");
		        choice = console.next().toLowerCase();
	            command = choice.charAt(0);

		       switch (command)
		       {
		                 case 'a': // find if the shape is a square
		                 		 if (shape1.isSquare())
						          	System.out.println("\tIt is a square");
						         else
         	                        System.out.println("\tIt is not a square");

		                      break;
		                 case 'b': //find if it is rectangle
		                     	if (shape1.isRectangle())
							         System.out.println("\tIt is a rectangle ");
							 	 else
      	                             System.out.println("\tIt is not a rectangle");
		                     	 break;
		                 case 'c': //find perimeter
								 System.out.println(shape1.findPerimeter());
		                         break;
		                 case 'd': //find the perimeter is a square or rectangle
                                 if (shape1.isRectangle() || shape1.isSquare())
                                 	System.out.println(shape1.findArea());
                                 else
                                 	System.out.println("Cannot find the area.");
		                         break;
		                 case 'e': //are all sides different
                                  if (shape1.differentSides())
                                  	System.out.println("\tAll 4 sides are different");
                                  else
                                  	System.out.println("\tAll 4 sides are not different.");

		                          break;
		                 case 'f': //print all the sides
								  System.out.println(shape1.toString());
		                          break;
		                 case 'g': // change the sides
		                 		  System.out.print("Which side you are changing (1, 2, 3, 4)?");
		                 		  int side = console.nextInt();
		                 		  System.out.println("Enter the length to chage side " + side + ":");
		                 		  int value = console.nextInt();
		                 		  if (side == 1)
		                 		  		shape1.setSide1(value);
		                 		  else if (side == 2)
		                 		  		shape1.setSide2(value);
		                 		  else if (side == 3)
		                 		  		shape1.setSide3(value);
		                 		  else if (side ==4)
		                 		  		shape1.setSide4(value);
		                 		  else
		                 		  		System.out.println("Wrong input" );
		                 		  break;
		                 case '?':
		                      printMenu();
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
		                   + "a: Is it a square\n"
		                   + "b: Is it a rectangle\n"
		                   + "c: find perimeter\n"
		                   + "d: find arae\n"
		                   + "e: all sides different?\n"
		                   + "f: print sides\n"
		                   + "g: change the sides\n"
		                   + "?: display the menu again\n"
		                   + "q: quit this program\n\n");

		    } // end of the printMenu method


}
