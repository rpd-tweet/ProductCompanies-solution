import java.util.*;
class SortStack
{	
     Stack<Integer> stack1=new Stack<Integer>();
	 Stack<Integer> stack2=new Stack<Integer>();
    
	void pushSort(int n)
	{
		if(stack1.empty())
		{
			stack1.push(n);
		}
		else
		{
			while(true)
			{
				if(!stack1.empty() && stack1.peek()<n)
				{
					stack2.push(stack1.pop());
				}
				else
				{
					stack1.push(n);
					while(!stack2.empty())
					{
						stack1.push(stack2.pop());
					}
					break;
				}
			}
		}
	}
    
	void print()
	{
		while(!stack1.empty())
		{
			System.out.print(stack1.pop()+" ");
		}
	}
		
	
	
	public static void main(String rpd[])
	{
		SortStack sortstack=new SortStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			sortstack.pushSort(sc.nextInt());
		}
		sortstack.print();
	}
}
		
		