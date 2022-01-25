package exception;

public class ExceptionExamples 
{
	public static void main(String[] args)
	{
		int num1=10;
		int array[]=new int[5];  
		String s=null;
		try
		{
			//num1/=array[1];
			s.length();
			array[10]=50;
		}
		catch (ArithmeticException exception)
		{
			System.out.println("Exception error occured : ");
			System.out.println(exception.getStackTrace()+" "+exception.getMessage());
			System.out.println(exception+" " +exception.getCause());
			exception.printStackTrace();
			System.out.println(exception.toString());
		}
		catch (NullPointerException exception)
		{
			System.out.println("Exception error occured : ");
			System.out.println(exception.getStackTrace()+" "+exception.getMessage());
			exception.printStackTrace();
			System.out.println(exception.toString());
		}
		catch (ArrayIndexOutOfBoundsException  exception)
		{
			System.out.println("Exception error occured : ");
			System.out.println(exception.getStackTrace()+" "+exception.getMessage());
			exception.printStackTrace();
			System.out.println(exception.toString());
		}
		finally
		{
			System.out.println(num1);
			System.out.println(array[2]);
			System.out.println("Program fully runed");
			
		}
	}
}
