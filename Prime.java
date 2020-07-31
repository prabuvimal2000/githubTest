import java.util.*;
public class Prime
{
    public static boolean checkPrime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        if(n==2||n==3)
           return true;
        else if (n%2==0||n%3==0)
           return false;
        else
        {
            for(int i=5;(i*i)<=n;i=i+6)
            {
                if(n%i==0||n%(i+2)==0)
                   return false;
            }
        }
        return true;
    }
    public static void main (String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to check whether Prime or Not: ");
      int num=sc.nextInt();
      if(checkPrime(num))
        System.out.println("It is a Prime number");
      else
        System.out.println("It is not a Prime number");
    }
}
