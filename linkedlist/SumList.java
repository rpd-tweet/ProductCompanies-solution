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
	
class SumList
{
	Node head;
	Node root;
	Node result;
	SumList()
	{
		this.head=null;
		this.root=null;
		this.result=null;
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
	void sumList()
	{
		Node temp1=head;
		Node temp2=root;
		int carry=0;
		int d=0;
		while(temp1!=null && temp2!=null)
		{
			carry=(temp1.data+temp2.data+carry)/10;
			d=(temp1.data+temp2.data+carry)%10;
			result=append(d,result);
			temp1=temp1.next;
			temp2=temp2.next;
		}
		while(temp1!=null)
		{
			result=append(temp1.data,result);
			temp1=temp1.next;
		}
		while(temp2!=null)
		{
			result=append(temp2.data,result);
			temp2=temp2.next;
		}
	}
	
			
		
		
		
	void print()
	{
		Node temp=result;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String rpd[])
	{
		SumList sumlist=new SumList();
		Scanner sc=new Scanner(System.in);
		System.out.println("List 1 : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sumlist.head=sumlist.append(sc.nextInt(),sumlist.head);
		}
		System.out.println("List 2 : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sumlist.root=sumlist.append(sc.nextInt(),sumlist.root);
		}
		sumlist.sumList();
		sumlist.print();
	}
}
			
		
		