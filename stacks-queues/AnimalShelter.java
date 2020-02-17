import java.util.*;
class Node
{
	Node next;
	String type;
	String breed;
	Node(String ty,String d)
	{
		breed=d;
		type=ty;
		next=null;
	}
}

class AnimalShelter
{	
    Node head;
	
    AnimalShelter()
	{
		this.head=null;
	}
      
	void append(String type,String breed)
	{
		Node t=new Node(type,breed);
		if(head==null)
		{
			head=t;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=t;
		}
	}
	
	void pop(String t)
	{
		if(head!=null)
		{
		if(t.equals("All"))
		{
			System.out.println(head.breed);
			head=head.next;
		}
		else
		{
			Node temp=head;
			Node prev=head;
			while(temp!=null)
			{
				if(temp.type.equals(t))
				{
					System.out.println(temp.breed);
					prev.next=temp.next;
					return;
				}
				prev=temp;
				temp=temp.next;
			}
			//System.out.println("out of type");
		 }
		}
		else
		{
			System.out.println("Out of animals");
		}
	}	
     
	 void print()
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.println(temp.type);
			 temp=temp.next;
		 }
	 }
    
	
	public static void main(String rpd[])
	{
		AnimalShelter animalshelter=new AnimalShelter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number : ");
		int n=sc.nextInt();
		System.out.println("Type  Breed ");
		for(int j=0;j<n;j++)
		{
	    animalshelter.append(sc.next(),sc.next());
		}
		//animalshelter.print();
		
		System.out.println("Enter type : ");
		animalshelter.pop(sc.next());
		
		//animalshelter.print();
		
	}
}
		
		