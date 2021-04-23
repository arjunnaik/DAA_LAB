package b1.student05;

import java.util.Scanner;

import java.util.StringTokenizer;


class Customer
{
	String name;
	String date;
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the custome name");
		name = sc.next();
		System.out.println("Enter date of birth");
		date = sc.next();
		

	}
	public void display()
	{
	    System.out.println("Entered Customer details are:");
	    System.out.println("Name\t" + "Date(With comma)");
	    System.out.print(name + ",");
	    String delims = "/";
		StringTokenizer st = new StringTokenizer(date,delims);
		while(st.hasMoreElements())
		{
			System.out.print(st.nextElement() + ",");
		}
        System.out.println();
	    
	}
}
public class Lab2B {

	public static void main(String[] args) {
	
			System.out.println("Enter Customer Details");	
		    System.out.println("Enter Number of Customer");
			Scanner sc = new Scanner(System.in);
		     int i,n = sc.nextInt();
		     Customer cus[] = new Customer[n];
		     for (i=0; i<n; i++)
		     {
		    	 cus[i] = new Customer();
		    	 cus[i].read();
		    	 
		     }
		     for (i=0; i<n; i++)
		     {
		    	 cus[i].display();
		     }
		     
	}

}
