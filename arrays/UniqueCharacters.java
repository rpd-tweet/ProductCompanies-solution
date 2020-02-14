import java.util.*;

class UniqueCharacters {
  String string_to_check;

  public UniqueCharacters() // constructor
  {
    string_to_check = "";
  }

  boolean isUnique() {
    for (int i=0;i<string_to_check.length();i++)
    {
      char ch=string_to_check.charAt(i);
      if(string_to_check.indexOf(ch)!=string_to_check.lastIndexOf(ch))
      {
   return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {

    UniqueCharacters uniquecharacters = new UniqueCharacters();
    Scanner sc = new Scanner(System.in);
    uniquecharacters.string_to_check = sc.next();
    if (uniquecharacters.isUnique()) {
      System.out.println("String has unique characters");
    } else {
      System.out.println("String has duplicate characters");
    }

  }
}