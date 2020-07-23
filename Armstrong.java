import java.util.*;
class ArmCheck
{
  ArmCheck()
{
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the number to check whether the number is Arumstrong num or not :");
   int num=sc.nextInt();
   int result=0,rem,temp;
   temp=num;
    while(num!=0)
      {
       rem=num%10;
       result=result+(rem*rem*rem);
       num/=10;
      }
      if(temp==result)
      {
          System.out.println("The given number "+temp+ " is an Armstrong number");
       }
       else
       {
           System.out.println("The given number "+temp+ " is not an Armstrong number");
        }
}
  }
class Armstrong
{
  public static void main(String[] args)
 {
     ArmCheck obj = new ArmCheck();
  }
}
