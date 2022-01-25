/*
 * Program for covert the given decimal to hexadecimal number.
 * @author Prabu M
 * @since Jul 3 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class DecimalToHexadecimal 
{
 public static void main(String args[])
 {
	 Scanner input = new Scanner(System.in);
	 char[] hexa_Decimal= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 String hexaValue="";
	 System.out.print("Enter the decimal number: ");
	 int decimal=input.nextInt();
	 while(decimal>0)
	 {
		 int reminder=decimal%16;
		 hexaValue=hexa_Decimal[reminder]+hexaValue;
		 decimal/=16;
	 }
	 System.out.print("The equivalent hexadecimal number is : "+hexaValue);
	 input.close();
 }
}
