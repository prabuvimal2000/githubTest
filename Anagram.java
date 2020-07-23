import java.util.*;
import java.util.ArrayList;
public class Anagram
{
  public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first string :");
   String s1=sc.nextLine();
   System.out.println("Enter the second String : ");
   String s2=sc.nextLine();
   char[] a = s1.replace(" ","").toLowerCase().toCharArray();
   char[] b =s2.replace(" ","").toLowerCase().toCharArray();
   Arrays.sort(a);
   Arrays.sort(b);
   if(Arrays.equals(a,b))
  {
     System.out.println("It is an Anagram");
   }
  else
  {
       System.out.println("It is not an Anagram");
   }
  }
}
