import java.io.*;
import java.lang.Character;
public class PasswordChecker
{
  public static void checkStrong(String s)
  {  
      String special="@!#$%^&*()_+-=:'>?</'\\{}[]";
      boolean hasNumber=false,hasLower=false,hasUpper=false,hasSpecial=false;
      for(int i=0;i<s.length()&&(!hasUpper||!hasLower||!hasSpecial||!hasNumber);i++)
      {
          if(!hasUpper)
          {
              hasUpper=Character.isUpperCase(s.charAt(i));
          }
           if(!hasLower)
          {
              hasLower=Character.isLowerCase(s.charAt(i));
          }
          if(!hasNumber)
          {
              hasNumber=Character.isDigit(s.charAt(i));
          }
          if(!hasSpecial)
          {
              hasSpecial=special.contains(Character.toString(s.charAt(i)));
          }
      }
      if( hasSpecial&&hasNumber && hasLower && hasUpper && s.length()>=8)
      {
          System.out.println("Strong");
      }
      else if ((hasUpper||hasLower)&& hasSpecial&&s.length()>=6)
      {
          System.out.println("Moderate");
      }
      else{
          System.out.println("week");
      }
  }
  public static void main(String[] args)  throws Exception
  {
      BufferedReader sc = new BufferedReader(new InputStreamReader (System.in));
      String password= sc.readLine();
      checkStrong(password);
  }
}
