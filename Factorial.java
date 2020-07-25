import java.io.*;
public class Factorial
{
   public static int fact(int a)
  {
      if(a == 0)
        return 1;
     else
       return (a*fact(a-1)); 
     
  }
  public static void main(String[] args) throws Exception
  {
    BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(input.readLine());
    System.out.println("Factorial of given number  "+num+" is : "+fact(num));
   }
}
