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
	
class Partition
{
	Node head;
	Node list1;
	Node list2;
	Partition()
	{
		this.head=null;
		this.list1=null;
		this.list2=null;
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
	void listPartition(int k)
	{
		Node temp=head;
		Node tempNode=null;
		while(temp!=null)
		{
          if(temp.data<k)
		  {
            list1=append(temp.data,list1);
		  }
          else if(temp.data>k){
            list2=append(temp.data,list2);
		  }
		  else{
		  tempNode=temp;}
		  
			  
		  temp=temp.next;
		}
		temp=list1;
		while(temp.next!=null)
		{
		temp=temp.next;
		}
		temp.next=tempNode;
		tempNode.next=list2;
	}
			
		
		
		
	void print()
	{
		Node temp=list1;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String rpd[])
	{
		Partition partition=new Partition();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(partition.head);
		for(int i=0;i<n;i++)
		{
			partition.head=partition.append(sc.nextInt(),partition.head);
		}
		System.out.println("Number");
		int k=sc.nextInt();
		partition.listPartition(k);
		partition.print();
	}
}
			
		
		