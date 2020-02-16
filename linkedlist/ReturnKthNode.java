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
	
class ReturnKthNode
{
	Node head;
	ReturnKthNode()
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
	void findK(int k)
	{
		
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		count-=k;
		int c=0;
		temp=head;
		while(c!=count)
		{
			c++;
			temp=temp.next;
		}
		System.out.println(temp.data);
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
		ReturnKthNode returnkthnode=new ReturnKthNode();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			returnkthnode.append(sc.nextInt());
		}
		int k=sc.nextInt();
		returnkthnode.findK(k);
	}
}
			
		
		