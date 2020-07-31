import java.util.*;
public class DigitalSum
{
 public static void main (String[] args) 
 {
    Scanner sc = new Scanner (System.in);
    int num=sc.nextInt();
    int rem=num%9;
    if(rem==0)
     System.out.println("9");
    else
     System.out.println(rem);
 }
}
