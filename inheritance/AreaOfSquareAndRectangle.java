/*
 * Program for print the area of rectangle and square.
 * @author Prabu M
 * @since Jul 7 2021
 * 
 */
package inheritance;
import java.util.Scanner;
public class AreaOfSquareAndRectangle 
{
public void area(float length,float breadth)
{
	float result = length*breadth;
	System.out.printf("The area of rectangle is : %.2f",result);
}
public void area(float side)
{
	float result = side*side;
	System.out.printf("\nThe area of square is : %.2f",result);
}
 public static void main(String[] args)
 {
	 float length,breadth,sideOfSquare;
	 Scanner input = new Scanner(System.in);
	 AreaOfSquareAndRectangle obj = new AreaOfSquareAndRectangle ();
	 System.out.println("Enter the length of the rectangle : ");
	 length=input.nextFloat();
	 System.out.println("Enter the breadth of the rectangle : ");
	 breadth=input.nextFloat();
	 System.out.println("Enter the one side of the square : ");
	 sideOfSquare=input.nextFloat();
	 obj.area(length,breadth);
	 obj.area(sideOfSquare);
	 input.close();
 }
}
