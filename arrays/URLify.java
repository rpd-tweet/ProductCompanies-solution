import java.util.*;

class URLify {
  String string;

  public URLify() // constructor
  {
    string = "";
  }

  void replace() {
    string=string.replaceAll(" ","%20");

  }

  public static void main(String[] args) {

    URLify urlify = new URLify();
    Scanner sc = new Scanner(System.in);
    urlify.string = sc.nextLine();
    urlify.replace();
    System.out.println(urlify.string);
	

  }
}