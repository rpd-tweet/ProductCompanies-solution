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
	
class RemoveDup
{
	Node head;
	RemoveDup()
	{
		this.head=null;
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
	void removeDup()
	{
		Node slow=head;
		Node prev=head;
		Node fast=head.next;
		while(slow.next!=null)
		{
			while(fast!=null)
			{
				if(slow.data==fast.data)
				{
				prev.next=fast.next;
				}
			prev=fast;
			fast=fast.next;
			}
			slow=slow.next;
			prev=slow;
			fast=slow.next;
		}
	}
	void print()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String rpd[])
	{
		RemoveDup removedup=new RemoveDup();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			removedup.append(sc.nextInt());
		}
		removedup.removeDup();
		removedup.print();
	}
}
			
		
		