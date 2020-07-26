import java.util.Scanner;
public class Divisibility{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int size = sc.nextInt();
      int[] arr= new int[size];
      int sum=0;
      for(int i=0;i<size;i++)
      {
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++)
      {
          sum+=arr[i];
      }
      if(sum%2==0&&sum%3==0&&sum%5==0)
      {
          System.out.println("1");
      }
      else
      {
          System.out.println("0");
      }
    }
}
