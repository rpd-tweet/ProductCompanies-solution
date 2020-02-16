import java.util.*;
class ThreeStack
{
	int stack[];//=new String[30];
	int stack1;
	int stack2;
	int stack3;
	
	
	ThreeStack()
	{
		this.stack=new int[30];
		this.stack1=0;
		this.stack2=10;
		this.stack3=20;
	}
	
	void push(int stackno,int val)
	{
		  if(stackno==1)
		  {
			  stack[stack1]=val;
			  stack1++;
		  }
		  else if(stackno==2)
		  {
			  stack[stack2]=val;
			  stack2++;
		  }
		  else
		  {
			  stack[stack3]=val;
			  stack3++;
		  }		
	}
	void pop(int stackno)
	{
		if(stackno==1)
		{
			System.out.println("\npopped: "+stack[--stack1]);
			//stack1--;
		}
		else if(stackno==2)
		{
			System.out.println("\npopped: "+stack[--stack2]);
			//stack2--;
		}
		else
		{
			System.out.println("\npopped: "+stack[--stack3]);
			//stack3--;
		}
	}
	
	void print()
	{
		System.out.println("Stack 1 : ");
		for (int i=0;i<stack1;i++)
		{
			System.out.println(stack[i]+" ");
		}
		System.out.println("Stack 2 : ");
		for (int i=10;i<stack2;i++)
		{
			System.out.println(stack[i]+" ");
		}
		System.out.println("Stack 3 : ");
		for (int i=20;i<stack3;i++)
		{
			System.out.println(stack[i]+" ");
		}
	}
	
	public static void main(String rpd[])
	{
		ThreeStack threestack=new ThreeStack();
		System.out.println("\nNo of Pushes : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			threestack.push(sc.nextInt(),sc.nextInt());
		}
		threestack.print();
		System.out.print("No of pops : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//System.out.println("Stack "+(i+1)+" ");
			threestack.pop(sc.nextInt());
		}
		threestack.print();
	}
}