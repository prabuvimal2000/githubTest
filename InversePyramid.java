import java.util.*;
public class InversePyramid
{
  public static void  reversePyramid(int num)
  {  
     for(int i=num;i>=1;i--)
       {
           for(int j=num;j>i;j--)
           {
               System.out.print(" ");
           }
           for(int k=1;k<(i*2);k++)
           {
                   System.out.print("*");
           }
           System.out.println("");   
       }
  }
  public static void main (String[] args)
    {
       Scanner sc = new Scanner (System.in);
       int num= sc.nextInt();
       reversePyramid(num);
    }
}
