import java.util.*;

class MatrixRotation {
	
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
  
  void Rotation() {
	  for(int i=0;i<size/2;i++)
	  {
		  for (int j=i;j<size-1-i;j++)
		  {
			  int temp=matrix[i][j];
			  matrix[i][j]=matrix[j][size-1-i];
			  matrix[j][size-1-i]=matrix[size-1-j][size-1-i];
			  matrix[size-1-j][size-1-i]=matrix[size-1-j][i];
			  matrix[size-1-j][i]=temp;
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

    MatrixRotation matrixrotation = new MatrixRotation();
    Scanner sc = new Scanner(System.in);
    matrixrotation.size=sc.nextInt();
	matrixrotation.matrix=new int[matrixrotation.size][matrixrotation.size];
	matrixrotation.getMatrix();
    matrixrotation.Rotation();
	matrixrotation.print();
	
	

  }
}