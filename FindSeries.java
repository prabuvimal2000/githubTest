import java.util.Scanner;
/*
 You are provided with a number "N", Find the Nth term of the series: 1, 4, 9, 25, 36, 49, 64, 81, .......

(Print "Error" if N = negative value and 0 if N = 0).
*/
public class FindSeries{ 
    public static void findNum(int n)
    {
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //enter the num to find in the given seres
        int num = sc.nextInt();
        if(num!=0)
        {
          findNum(num);
        }
        else if(num==0)
        {
         System.out.println(num);
        }    
        else 
        {
           System.out.println("Error");
        }
    }
}
