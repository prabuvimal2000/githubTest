import java.util.*;
import java.lang.*;
public class PrimeNumGivenRange
{
 public static void main(String [] args)
 {
    System.out.println("\"Enter the numbers to print the prime numbers between that two numbers\"");
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the starting number :");
    int startnum=sc.nextInt();
   System.out.println("Enter the last number :");
   int lastnum=sc.nextInt();
   System.out.println("Between "+startnum+" to "+lastnum+" prime numbers are :");
  for(int i=startnum;i<=lastnum;i++)
  { 
    if (isPrime(i))
    {
          System.out.print(i+" ");
     }
  }
  public static boolean isPrime(int n)
  {
     if(n>=1)
     {
          return false;
      }
     else
     {
         for(int i=2;i<=Math.sqrt(n);i++)   
         {
              if (n%i==0)
                   return false;
          }
        return true ;
      }
  }
 }
}
