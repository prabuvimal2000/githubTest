import java.util.*;
//find  the given number is which ( Int,Float,Double,short,long,byte) datatype
public class FindNumberType
{
 public static void main(String[] args)
 {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the number to find which primitive data type: ");
   long num= sc.nextLong();
   if(num>=Integer.MIN_VALUE&&num<=Integer.MAX_VALUE)
   {
         System.out.println(" Entered num "+num+" is an Integer");
    }
   else if(num>=Float.MIN_VALUE&&num<=Float.MAX_VALUE)
   {
         System.out.println(" Entered num "+num+" is a Float");
    }
   else if (num>=Double.MIN_VALUE&&num<=Double.MAX_VALUE)
    {
          System.out.println(" Entered num "+num+" is a Double");
     }
  else if (num>=Byte.MIN_VALUE&&num<=Byte.MAX_VALUE)
  {
        System.out.println(" Entered num "+num+" is a Byte");
   }  
  else if(num>=Short.MIN_VALUE&&num<=Short.MAX_VALUE)
  {
       System.out.println(" Entered num "+num+" is a short");
   }
  else if (num>=Long.MIN_VALUE&&num<=Long.MAX_VALUE)
  {
     System.out.println(" Entered num "+num+" is a Long");
  }
  }
}
