import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a =s.toCharArray();
        char[] b=new char[s.length()];
        int i=0;
        while(i!=s.length())
        {
            b[i]=a[s.length()-i-1];
            i++;
        }
        i=0;
        while(i!=s.length())
        {
          if(a[i]!=b[i])
          {
            System.out.println("0");
            System.exit(0);
          }
          else
          {
            i++;
            continue;
           } 
        }
        System.out.println("1");
    }
}
