import java.util.*;
public class BalancedParenthesis 
{
 public static boolean checkParenthesis(String s) 
 {
     Stack<Character> set = new Stack<>();
     for(int i=0;i<s.length();i++)
     {
         if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
         {
             set.push(s.charAt(i));
         }
         else
         {
             if(set.isEmpty())
             {
                 return false;
             }
             else
             {
                char pop = set.pop();
                if(s.charAt(i)==')'&&pop!='('||s.charAt(i)=='}'&&pop!='{'||s.charAt(i)==']'&&pop!='[')
                {
                  return false;   
                }
             }
         }
     }
         if(set.isEmpty())
         {
             return true;
         }
         else
         {
             return false;
         }
 }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
    if(checkParenthesis(s))
       System.out.println(1);
    else
       System.out.println(0);
    }
}
