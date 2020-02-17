import java.util.*;
class StackMin
{
	int stack[];//=new String[30];
	int stack1;
	int min;
	
	
	StackMin()
	{
		this.stack=new int[30];
		this.stack1=0;
		this.min=0;
	}
	
	void push(int val)
	{
	      if (stack1!=0)
		  {
			  if(min>val)
			  {
				  min=val;
			  }
		      stack[stack1]=val;
		  }
		  else
		  {
			  min=val;
			  stack[stack1]=val;
		  }
		  stack1++;
			  
	}

	
	void print()
	{
		System.out.println("Min : "+min);
	}
	
	public static void main(String rpd[])
	{
	    StackMin stackmin=new StackMin();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			stackmin.push(sc.nextInt());
		}
		stackmin.print();
	}
}