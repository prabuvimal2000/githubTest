import java.util.*;
public class StringWeight
{
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      String s = sc.nextLine();
      int size =s.length();
      int sum=0,i=0;
      while (i!=size)
      {
        sum+=(int)(s.charAt(i));
        i++;
      }
      System.out.println(sum);
    }
}
