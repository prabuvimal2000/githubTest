import java.util.*;
public class StringInt
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the String ");
   String s= sc.nextLine();
   int size=s.length();
   int i=0;
   while(i!=size)
   {
     if(s.charAt(i)>='0' && s.charAt(i)<='9')
     {
       i++;
     }
     else
     {
       System.out.println("It ia not an Integr String");
       System.exit(0);
     }
   }
   System.out.println("It is an Integer String");
 }
}
