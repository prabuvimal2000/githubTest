import java.util.*;
public class SumOfNum
{
    public static void main(String[] args) 
    {
       Scanner sc =new Scanner (System.in);
       int num=sc.nextInt();
       int i,result=0;
       for(i=1;i<=num;i++)
       {
           result +=i;
       }
       System.out.println(result);
    }
}
