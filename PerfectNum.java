import java.util.*;
public class PerfectNum
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check whether it's Perfect number or not :");
        n = sc.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number "+n+" is Perfect number");
        }
        else
        {
            System.out.println("Given number is "+n+" not Perfect a number");
        }    
    }
}
