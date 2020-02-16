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
	
class LoopDetection
{
	Node head;
	LoopDetection()
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
		
	
		
		
		
	int loopDetection()
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				break;
			}
		}
		if(slow==fast)
		{
			slow=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
		}
		else{
			return -1;
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
		LoopDetection loopdetection=new LoopDetection();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			loopdetection.append(d);
		}
		loopdetection.head.next.next.next.next.next.next=loopdetection.head.next.next;
		System.out.println(loopdetection.head.next.next.next.next.next.data);
		System.out.println(loopdetection.head.next.next.data);
		System.out.println("Loop detected @ "+loopdetection.loopDetection());
		
		
		
	}
}
			
		
		