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
	
class DeleteMid
{
	Node head;
	DeleteMid()
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
	void deleteMid()
	{
		Node slow=head;
		Node fast=head;
		Node prev=head;
		while(fast!=null && fast.next!=null && fast.next!=null)
		{
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=slow.next;
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
		DeleteMid deletemid=new DeleteMid();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			deletemid.append(sc.nextInt());
		}
		deletemid.deleteMid();
		deletemid.print();
	}
}
			
		
		