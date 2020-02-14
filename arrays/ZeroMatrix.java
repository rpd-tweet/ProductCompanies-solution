import java.util.*;

class ZeroMatrix {
	
  int matrix[][];
  int size;

  void getMatrix()
  {
	  Scanner s=new Scanner(System.in);
	  for(int i=0;i<size;i++)
	  {
		  for(int j=0;j<size;j++)
		  {
			  matrix[i][j]=s.nextInt();
		  }
	  }
  }
  
  void zeroMatrix() {
	  
	  Set<Integer> row=new HashSet<Integer>();
	  Set<Integer> col=new HashSet<Integer>();
	  for(int i=0;i<size;i++)
	  {
		  for (int j=0;j<size;j++)
		  {
			  if (matrix[i][j]==0)
			  {
				  row.add(i);
				  col.add(j);
			  }
			  
		  }
	  } 
    for(int i=0;i<size;i++)
	  {
		  for (int j=0;j<size;j++)
		  {
			  if (row.contains(i) || col.contains(j)) 
			  {
				  matrix[i][j]=0;
			  }
			  
		  }
	  }  	  
	 
  }
  
  void print()
  {
	  for(int i=0;i<size;i++)
	  {
		  for(int j=0;j<size;j++)
		  {
			  System.out.print(matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
  }
  


  public static void main(String[] args) {

    ZeroMatrix zeromatrix = new ZeroMatrix();
    Scanner sc = new Scanner(System.in);
    zeromatrix.size=sc.nextInt();
	zeromatrix.matrix=new int[zeromatrix.size][zeromatrix.size];
	zeromatrix.getMatrix();
    zeromatrix.zeroMatrix();
	zeromatrix.print();
	
	

  }
}