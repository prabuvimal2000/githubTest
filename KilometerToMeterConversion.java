/*
 * Program for convert the given kilometer to meter and print the meter.
 * @author Prabu M
 * @since Jul 1 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class KilometerToMeterConversion 
{
 public static void main(String[] args)
 {
	 float kilometer,meter;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the kilometer : ");
	 kilometer=input.nextFloat();
	 meter=kilometer*1000;
	 System.out.println("Your entered kilometer "+kilometer+" km equalent meter is "+meter+" m");
	 input.close();
 }
}
