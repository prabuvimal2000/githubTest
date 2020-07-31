import java.util.*;
public class Combination
{
  static int combination(int a,int b)
  {
    if(b==0)
      return 1;
    return  fact(a)/(fact(b)*fact(a-b)); 
  }
  static int fact(int a)
  {
    if(a<=1)
       return 1;
    return a*fact(a-1);
  }
  public static void main (String[] args) 
  {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the no.of chances : ");
      int a=sc.nextInt();
      System.out.println("Enter the no.of fav chances: ");
      int b=sc.nextInt();
      System.out.println("The Permutation is : "+combination(a,b));
  }
}
