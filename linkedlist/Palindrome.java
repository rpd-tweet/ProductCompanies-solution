import java.util.*;
class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
class Palindrome
{
	Node head;
	Node rev_head;
	Palindrome()
	{
		this.head=null;
		this.rev_head=null;
	}
	
	void append(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
		
    void push(int d)
	{
		Node new_node=new Node(d);
		if(rev_head==null)
		{
			rev_head=new_node;
		}
		else{
			new_node.next=rev_head;
			rev_head=new_node;
		}
	}
	
		
		
		
	Boolean checkPalindrome()
	{
		Node temp1=head;
		Node temp2=rev_head;
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data==temp2.data)
			{
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else{
				return false;
			}
		}
		if(temp1!=null || temp2!=null)
		{
			return false;
		}
		return true;
	}
	
			
		
		
		
	void print()
	{
		Node temp=rev_head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String rpd[])
	{
		Palindrome palindrome=new Palindrome();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			palindrome.append(d);
			palindrome.push(d);
		}
		if(palindrome.checkPalindrome())
		{
			System.out.println("Yes!! Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		
	}
}
			
		
		