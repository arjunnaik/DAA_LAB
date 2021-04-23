package b1.student05;
import java.util.Scanner;

public class Lab3A {

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);

		int num1,num2,ans;
		System.out.println("Enter First Integer");
		num1 = s.nextInt();
		System.out.println("Enter Second Integer");
		num2 = s.nextInt();
		try
		{
			ans = num1 / num2;
			System.out.println("Result " + ans);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught : Division by zero " + e);
		}
		
		
	}

}
