
import java.util.*;
class QueueViaStack
{
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	
	
	void push(int n)
	{
		while(!stack1.empty())
		{
			stack2.push(stack1.pop());			
		}
		stack1.push(n);
		while(!stack2.empty())
		{
			stack1.push(stack2.pop());
		}
	}
	
	void pop()
	{
	  System.out.println(stack1.pop());
	}
	 
	
	
	public static void main(String rpd[])
	{
		QueueViaStack queueviastack=new QueueViaStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			queueviastack.push(sc.nextInt());
		}
		
		
		System.out.println("Tyms to pop : ");
		n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			queueviastack.pop();
		}
		
	}
}
		
		