import java.util.*;
public class InvertedHalfPyramid
{
  public static void main (String[] args)
    {
       Scanner sc = new Scanner (System.in);
       int num= sc.nextInt();
       for(int i=0;i<num;i++)
       {
           for(int j=i;j<num;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}
