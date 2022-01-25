/*
 * Program for do the appropriate traffic operation given below by depend upon the given colour from the user.
 * The red is for 'stop' ,green is for 'go' ,yellow is for 'proceed with caution' and default is 'prepare to go'.
 * @author Prabu M
 * @since Jul 2 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class RoadSignal {
	public static void main(String[] args)
	{
		String userColour;
		System.out.println("Enter the colour: ");
		Scanner input= new Scanner(System.in);
		userColour=input.nextLine().toLowerCase();
		switch(userColour)
		{
		 case "red":
			 System.out.println("stop");
			 break;
		 case "green":
			 System.out.println("go");
			 break;
		 case "yellow":
			 System.out.println("proceed with caution");
			 break;
		 default:
			 System.out.println("prepare to go");
		}
		input.close();
	}

}
