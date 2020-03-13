import java.util.*;
class Node
{
	Node left,right;
	int data;
	Node(int d)
	{
		this.data=d;
		this.left=this.right=null;
	}
}
class BSTsequence
{
	Node root;
	
	Node insert(Node root,int d)
	{
	if (root==null)
	{
		return new Node(d);
	}		
	if (root.data>d)
	{
		root.left=insert(root.left,d);
	}
	if (root.data<d)
	{
	root.right=insert(root.right,d);
	}
	return root;
		
	}
	
	void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	
	public static void main(String rpd[])
	{
		BSTsequence bstsequence =  new BSTsequence();
		Scanner sc=new Scanner(System.in);
		System.out.println("Arrays size :");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			bstsequence.root=bstsequence.insert(bstsequence.root,sc.nextInt());
		}
		bstsequence.print(bstsequence.root);
	}
}