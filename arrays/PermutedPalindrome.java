import java.util.*;

class PermutedPalindrome {
	static int MAX_VALUE=256;
	
  String string_to_check;

  public PermutedPalindrome() // constructor
  {
    string_to_check = "";
  }

  boolean palindromeCheck() {
    int charCount[]=new int[MAX_VALUE];
	int odd=0;
	for(int i=0;i<string_to_check.length();i++)
	{
		charCount[string_to_check.charAt(i)]++;
	}
	for (int i=0;i<MAX_VALUE;i++)
	{
		if(charCount[i]%2!=0)
		{
			odd++;
		}
	}
	if ((string_to_check.length()%2!=0 && odd==1) || (string_to_check.length()%2==0 && odd==0))
	    return true;
	else
		return false;
	

  }

  public static void main(String[] args) {

    PermutedPalindrome permutedpalindrome = new PermutedPalindrome();
    Scanner sc = new Scanner(System.in);
    permutedpalindrome.string_to_check = sc.next();
    if (permutedpalindrome.palindromeCheck()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}