import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("NULL");
        }
        else
        {
          for(int i=1;i<=n;i++)
          {
            int a=9*i;
            System.out.print(a+" ");
          }
        }
    }
}
