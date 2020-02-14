import java.util.*;

class StringCompression {
	
  String string;

  public StringCompression() // constructor
  {
    string= "";
  }

  String compress() {
    String str="";
	int i=1;
	int count=1;
	while(i<string.length())
	{
		if(string.charAt(i)==string.charAt(i-1))
		{
			i++;
			count++;
			
		}
		else
		{
			str+=string.charAt(i-1);
			str+=count;
			count=1;
			i++;
		}
	}
	str+=string.charAt(i-1);
	str+=count;
	if (str.length()<string.length())
	 return str;
    return string;
	
	

  }

  public static void main(String[] args) {

    StringCompression stringcompression = new StringCompression();
    Scanner sc = new Scanner(System.in);
    stringcompression.string = sc.next();
    System.out.println(stringcompression.compress());
	

  }
}