/*
 * Sample Program for Lambda Expressions .
 * @author Prabu M
 * @since Aug 17 2021
 * 
 */
package lambdaexamples;

import java.util.Scanner;

interface ArithmaticOpeartion
{
	int arithmaticOpeartions(int num1,int num2);
}
public class LambdaExpressions
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int number1,number2;
     System.out.println("Please enter the first Number : ");
     number1=input.nextInt();
     System.out.println("Please enter the Second Number : ");
     number2=input.nextInt();
     ArithmaticOpeartion calculate = (num1,num2)->{ return num1+num2;};
     System.out.println("Addition of that two number is : "+calculate.arithmaticOpeartions(number1,number2));
     ArithmaticOpeartion calculate3 =((num1,num2)->num1-num2);
     System.out.println("subraction of that two number is : "+calculate3.arithmaticOpeartions(number1,number2));
     ArithmaticOpeartion calculate1 = (num1,num2)->num1/num2;
     System.out.println("division of that two number is : "+calculate1.arithmaticOpeartions(number1,number2));
     ArithmaticOpeartion calculate2 = (int num1,int num2)->{System.out.println("num1 value is : "+num1);
     System.out.println("num2 value is : "+num2);
     System.out.print("Multiplication of num1 and num2 is : ");
     return num1*num2;};
     System.out.print(calculate2.arithmaticOpeartions(number1,number2));
     input.close();
    }
}
