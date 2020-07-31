import java.util.*;
public class Vote
{
  static  boolean checkEligibel(int age)
  {
    if(age>=18) 
     return true;
    else
     return false;
  }
  public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Your age: ");
      int age =sc.nextInt();
      if(checkEligibel(age))
      {
          System.out.println("Your Eligible to Vote");
      }
      else
      {
          System.out.println("Sorry Your not Eligible to vote");
      }
    }
}
