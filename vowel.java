import java.io.*;
import java.util.*;
import java.lang.*;
class vowel
{
  public static void main(String args[]) throws java.lang.Exception
  {
    char c;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter an charecter");
    c=s.next().charAt(0);
    if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
    {
      System.out.println("Vowel");
 
    }
    else if(c>='b' && c<='z' ||c>='B' && c<='Z')
    {
    System.out.println("Consonent");
    }
    else
    {
      System.out.println("Not an Alphabet");
    }
  }
}
