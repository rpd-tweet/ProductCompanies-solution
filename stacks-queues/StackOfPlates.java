import java.util.*;

class StackOfPlates
{
	
	Stack<Stack> stack=new Stack<Stack>();	
	
	void push(int p,int c)
	{
		
		if (stack.size()==0)
		{
			Stack<Integer> s1=new Stack<Integer>();
		 stack.push(s1);
		 s1.push(p);
		}
		else if (stack.peek().size()==c)
		{
			Stack<Integer> s1=new Stack<Integer>();
			 stack.push(s1);
			 s1.push(p);
		}
		else
		{
			Stack<Integer> s1=stack.pop();
			s1.push(p);
			stack.push(s1);
		}
	}
	void pop(int c)
	{
		if(stack.size()==0)
		{
			System.out.println("Noting to pop");
		}
		else
		{
			if(stack.peek().size()==0)
			{
			stack.pop();
			Stack<Integer> s1=stack.peek();
			System.out.println(s1.pop());
			}
			else{
				Stack<Integer> s1=stack.peek();
			System.out.println(s1.pop());
			}
				
		}
	}
			
		
		
	void print()
	{
		while(stack.size()!=0)
		{
			Stack<Integer> s2=stack.pop();
			while(s2.size()!=0)
			{
				System.out.print(s2.pop()+" ");
			}
		}
	}
	
	
public static void main(String rpd[])
{
	Scanner sc=new Scanner(System.in);
	StackOfPlates stackofplates=new StackOfPlates();
	System.out.println("Enter Capacity : ");
	int cp=sc.nextInt();
	System.out.println("Enter no of pushes : ");
	int p=sc.nextInt();
	for(int i=0;i<p;i++)
	{
		stackofplates.push(sc.nextInt(),cp);
	}
	System.out.println("Enter no of pops : ");
	p=sc.nextInt();
	for(int i=0;i<p;i++)
	{
		System.out.println("Pop: ");
		stackofplates.pop(cp);
	}
	//stackofplates.print();
}
}
 