//check the given chracter is alphabet or not 
import java.util.*;
public class Alphabet
{
 public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the character to check whether it is alphabet or not : ");
   char ch = input.next().charAt(0);
  /* if ((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
   {
         System.out.println("Entered character "+ch+ " is  an alphabet ");
    }
   else 
       System.out.println("Entered character "+ch + " is not an alphabet");
*/
  System.out.println( ((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))?"Entered character "+ch+" is an alphabet":"Entered chracter "+ch+" is not an alphabet");  
 }
}
