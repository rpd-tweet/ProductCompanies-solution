import java.util.*;

class OneAway {
  String string1;
  
  String string2;

  public OneAway() // constructor
  {
    string1 = "";
	string2 = "";
  }

  boolean isOneAway() {
     
	 int m=string1.length();
	 int n=string2.length();
	 int count=0;
	if (Math.abs(m-n)>1) 
		return false;
	
	int i_string1=0;
	int j_string2=0;
	while(i_string1<m && j_string2<n)
	{
		if (string1.charAt(i_string1)!=string2.charAt(j_string2)){
			if(count==1) 
			{return false;
			}
			
			count++;
			if (m>n){
				i_string1++;
			}
			else if (n>m)
			{
				j_string2++;
			}
			else{
				i_string1++;
			j_string2++;
			}
			
		}
		else{
			i_string1++;
			j_string2++;
		}
	}
    return true;	

  }

  public static void main(String[] args) {

    OneAway oneaway = new OneAway();
    Scanner sc = new Scanner(System.in);
    oneaway.string1 = sc.next();
	oneaway.string2 = sc.next();
    if (oneaway.isOneAway()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}