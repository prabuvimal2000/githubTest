import java.io.*;
public class Pangram
{
 public static void main (String[] args) throws Exception
 {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    String s =sc.readLine();
    s=s.replaceAll("\\s","");
    char [] a=s.toUpperCase().toCharArray();
    int b[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int size=a.length;
    int i=0;
    while(i!=size)
    {
        int index=a[i]-65;
        b[index]=1;
        i++;
    }
    while(i!=26)
    {
        if(b[i]==1)
                i++;
       else
       {
          System.out.println("It ia not a Pangram");
          System.exit(0);
        } 
     }
   System.out.println("It is a Pangram");
 }
}
