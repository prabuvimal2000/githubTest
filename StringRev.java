import java.io.*;
public class StringRev
{  
 public static void main (String[] args) throws Exception
    {
       BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
       String s= sc.readLine();
       int size = s.length();
       char[] a = s.toCharArray();
       char[] b = new char[size];
       int i=0;
       while(i!=size)
       {
          b[i]= a[size-i-1];
           i++;
       }
       i=0;
       while (i!=size)
       {
           System.out.print(b[i]);
           i++;
       }
    }
}
