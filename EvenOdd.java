import java.util.*;
public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner (System.in);
        int num=sc.nextInt();
        String result =(num%2==0)?"Even":((num>0)?"Odd":"Zero");
        System.out.println(result);
    }
}
