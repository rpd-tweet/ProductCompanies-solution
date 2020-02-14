import java.util.*;

class CheckPermutation {
	static int constant=256;
	
  String string1_to_check;
  String string2_to_check;

  public CheckPermutation() // constructor
  {
    string1_to_check = "";
	string2_to_check = "";
  }

  boolean isPermuted(char string1[],char string2[]) {
	  
	  int count1[]=new int[constant];
	  int count2[]=new int[constant];
	  Arrays.fill(count1,0);
	  Arrays.fill(count2,0);
	  for(int i=0;i<string1.length;i++)
	  {
		  count1[string1[i]]++;
		  count2[string2[i]]++;
	  }
	  for (int i=0;i<constant;i++)
	  {
		  if (count1[i]!=count2[i])
		  {
			  return false;
		  }
	  }
	  return true;

  }
  

  public static void main(String[] args) {

    CheckPermutation checkpermutation = new CheckPermutation();
    Scanner sc = new Scanner(System.in);
    checkpermutation.string1_to_check = sc.next();
	checkpermutation.string2_to_check = sc.next();
	if(checkpermutation.string1_to_check.length()==checkpermutation.string2_to_check.length()){
    if (checkpermutation.isPermuted(checkpermutation.string1_to_check.toCharArray(),checkpermutation.string2_to_check.toCharArray())) {
      System.out.println("permuted");
    } 
	else {
      System.out.println("not permuted");
    }
	}
	else{
		System.out.println("not permuted");

  }
}
}
