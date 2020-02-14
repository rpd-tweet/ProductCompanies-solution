import java.util.*;

class StringRotation {
	
  String string;
  String string_to_check;

  public StringRotation() // constructor
  {
    string= "";
	string_to_check="";
  }

  boolean checkRotation() {
	  if (string.length()==string_to_check.length() && (string+string).contains(string_to_check))
	  {
		  return true;
	  }
	 return false;
	  
	  
  }


  public static void main(String[] args) {

    StringRotation stringrotation = new StringRotation();
    Scanner sc = new Scanner(System.in);
    stringrotation.string = sc.next();
	stringrotation.string_to_check = sc.next();
    System.out.println(stringrotation.checkRotation());
	

  }
}