package b1.student05;

import java.util.Scanner;

class Stack
{    int MAX=5,top=-1;
	int[] stack = new int[MAX];
	void push(int ele)
	{   if (top>=MAX-1)
			System.out.println("Stack is Overflow!!");
	    else
			stack[++top]=ele;
	}
	void pop()
	{
		if (top==-1)
			System.out.println("Stack is Underflow!!");
		else
		{	int k=stack[top--];
			System.out.println("Deleted element is " + k);
			
		}
	}
	void display()
	{
		
		System.out.println("Content of stack are");
		for (int i=top; i>=0; i--)
		{
			System.out.println(stack[i]);
			
		}
	}

		

}
public class Lab1B {
public static void main(String[] args) {
		Stack S = new Stack();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		do
		{    System.out.print("1.Push 2.Pop 3.Display 4.Exit \n2Enter your choice\n");
		
		 ch = sc.nextInt();
			
			switch (ch)
			{
			case 1:System.out.println("Enter element to be pushed");
				    S.push(sc.nextInt());
					break;
			case 2:S.pop();
					break;
			case 3:S.display();
					break;
			default :System.out.println("Enter a valid choice");
			
			
			}
			
		}while(ch!=4);
		

	}


}
