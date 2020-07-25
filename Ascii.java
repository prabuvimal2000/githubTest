import java.util.*;
public class Ascii
{
 public static void main(String[] args)
 {
   Scanner sc =new Scanner (System.in);
   System.out.println("Enter the first  character :");
   char ch =sc.next().charAt(0);
   System.out.println("Enter the Second character: "); 
   char ch2=sc.next().charAt(0);
   System.out.println("The ascii value between  entered characters is  : ");
   for (int i=ch ;i<=ch2;i++)
   {
       System.out.println(i);
   }
  }
}
