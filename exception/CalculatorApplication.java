package exception;
import java.util.Scanner;
class MultipleInvalidException extends Exception
{
	MultipleInvalidException()
	{
		super();
	}
	MultipleInvalidException(String error)
	{
		super(error);
	}
}
public class CalculatorApplication 
{
 public static void main(String[] args)
 {
	 int num1,num2,result;
	 char operator;
	 Scanner input = new Scanner (System.in);
	 System.out.println("Choose an operator : +, -, *, /,^");
	 operator = input.next().charAt(0);
	 try
	 {
		 System.out.println("Enter the first number : ");
		 num1=Integer.parseInt(input.next());
		 if(operator=='^')
		 {
			 System.out.println("Enter the power : ");
		 }
		 else
		 {
		   System.out.println("Enter the second number : ");
		 }
		 num2=Integer.parseInt(input.next());
		 switch(operator)
		 {
		  case '+':
			  result=num1+num2;
			  System.out.println("num1 : "+num1+" num2 : "+num2+" Result : "+result);
			  break;
		  case '-':
			  result=num1-num2;
			  System.out.println("num1 : "+num1+" num2 : "+num2+" Result : "+result);
			  break;
		  case '*':
			  if(num1!=0 && num1!=1 && num2!=0 && num2!=1)
			  {
			  result=num1*num2;
			  System.out.println("num1 : "+num1+" num2 : "+num2+" Result : "+result);
			  }
			  else
			  {
				  try
				  {
				   throw new MultipleInvalidException("please check your given number is not equal to 0 or 1");
				  }
				  catch (MultipleInvalidException userException)
				  {
					  System.out.println("Error occured : ");
					  System.out.println(userException.getMessage());
				  }
			  }
			  break;
		  case '/':
		      result=num1/num2;
		      System.out.println("num1 : "+num1+" num2 : "+num2+" Result : "+result);
			  break;
		  case '^':
			  result = (int)Math.pow(num1,num2);
			  System.out.println("num1 : "+num1+" num2 : "+num2+" Result : "+result);
			  break;
		 default:
			  System.out.println("Invalid opeartor");
			  break;
		 }
	 }
	 catch(ArithmeticException exception)
	 {
		 System.out.println("Exception Error occured ");
		 System.out.println(exception.getMessage());
		 System.out.println(exception.toString());
	 }
	 catch (Exception exception)
	 {
		 System.out.println("Exception Error occured ");
		 System.out.println(exception.getMessage());
		 System.out.println(exception.toString());
	 }
	 finally
	 {
		 input.close();
	 }
 }
}
