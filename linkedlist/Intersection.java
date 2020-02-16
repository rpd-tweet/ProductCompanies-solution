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
	
class Intersection
{
	Node head;
	Node root;
	Intersection()
	{
		this.head=null;
		this.root=null;
	}
	
	Node append(int data,Node list)
	{
		Node new_node=new Node(data);
		if(list==null)
		{
			list=new_node;
		}
		else
		{
			Node temp=list;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
		return list;
	}
		
	
		
		
		
	int checkIntersection()
	{
		Node temp1=head;
		Node temp2=root;
		while(temp1!=null)
		{
			while(temp2!=null)
		{
			if(temp1==temp2)
			{
				return temp1.data;
			}
			temp2=temp2.next;
		}
		temp1=temp1.next;
		}
		return -1;
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
		Intersection intersection=new Intersection();
		Scanner sc=new Scanner(System.in);
		System.out.println("List 1 :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			intersection.head=intersection.append(d,intersection.head);
		}
		System.out.println("List 2 :");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			intersection.root=intersection.append(d,intersection.root);
		}
		intersection.head=intersection.root;
		
		System.out.println("Intersect : "+intersection.checkIntersection());
		
		
		
	}
}
			
		
		