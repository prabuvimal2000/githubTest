import java.util.*;
public class BinarytoDec
{  
 public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int num =sc.nextInt();
        int rem=0,base=1,dec_value=0;
        while(num!=0)
        {
            rem = num%10; 
            num/=10; 
            dec_value+=rem*base;
            base*=2;
        }
        System.out.println(dec_value);
    }
}
