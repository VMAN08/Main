package test1;

public class Test3 {
	
	public static void main(String[] args)
	{
		int n = 19;
		int m = 36;
		int result = ((n/10 + n % 10));
		System.out.println(("The value of  n/10 + n%10 is: " + result));
		result = (n % 2 + m % 2);
		System.out.println("The value of n % 2 + m % 2 is: " + result);
		result = (m + n) / 2;
		System.out.println("The value of (m + n) / 2 is: " + result);
		double dresult = (m + n) / 2.0;
		System.out.println("The value of (m + n) / 2.0 is: " + dresult);
		result = (int) (0.5 * (m + n));
		System.out.println("The value of (int) (0.5 * (m + n) is: " + result);
		result = (int) Math.round(0.5 * (m + n));
		System.out.println("The value of (int) Math.round(0.5 * (m + n)) is: " + result);
		
		
		

	}

}
